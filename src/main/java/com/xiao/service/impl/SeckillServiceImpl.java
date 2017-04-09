/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import com.xiao.DTO.Exposer;
import com.xiao.DTO.SeckillExcution;
import com.xiao.bean.Seckill;
import com.xiao.bean.SuccessKilled;
import com.xiao.dao.SeckillDao;
import com.xiao.dao.SuccessKilledDao;
import com.xiao.exception.SeckillClosedException;
import com.xiao.exception.SeckillException;
import com.xiao.exception.SeckillRepeatException;
import com.xiao.service.SeckillService;

/**
 * @author Administrator
 *
 */
@Service
public class SeckillServiceImpl implements SeckillService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private final String salt = "avadfa%^%#!&#%^fdafafa~@$%^$&&^%&erere}{}*(*&*^";
	
	@Resource
	private SeckillDao seckillDao;
	
	@Resource
	private SuccessKilledDao successKilledDao;
	
	@Override
	public List<Seckill> getSeckillList() {
		return seckillDao.queryAllSeckill(0, 4);
	}

	@Override
	public Seckill getSeckillById(long seckillId) {
		return seckillDao.querySeckillById(seckillId);
	}

	@Override
	public Exposer exportSeckillUrl(long seckillId) {
		Seckill seckill = seckillDao.querySeckillById(seckillId);
		Date startTime = seckill.getStartTime();
		Date endTime = seckill.getEndTime();
		Date now = new Date();
		if(now.compareTo(startTime)<0||now.compareTo(endTime)>0){
			return new Exposer(false, seckillId, now.getTime(), startTime.getTime(), endTime.getTime());
		}
		String md5 = getMD5(seckillId);
		return new Exposer(true, md5, seckillId);
	}

	@Override
	@Transactional
	/**
	 * 使用注解控制事务方法的优点：
	 * 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作RPC/HTTP请求或者波流到事务方法外部，
	 * 3.不是所有方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	public SeckillExcution executeSeckill(long seckillId, long userPhone, String md5)
			throws Exception, SeckillException, SeckillRepeatException, SeckillClosedException {
		Date now = new Date();
		if(md5 == null || !md5.equals(getMD5(seckillId))){
			throw new SeckillException("Seckill action has been rewritten!");
		}
		int reduceUpdateCount = seckillDao.reduceNumber(seckillId, now);
		try {
			if(reduceUpdateCount<=0){
				//没有更新到记录，秒杀已结束
				throw new SeckillClosedException("Seckill action is closed!");
			}else{
				int insertSuccessSekill = successKilledDao.insertSuccessKilled(seckillId, userPhone);
				if(insertSuccessSekill<=0){
					//重复秒杀
					throw new SeckillRepeatException("Seckill action repeated!");
				}else{
					SuccessKilled successKilled = successKilledDao.querySuccessKilledWithId(seckillId, userPhone);
					return new SeckillExcution(seckillId, 1, "秒杀成功", successKilled);
				}
			}
		} catch(SeckillRepeatException e1){
			throw e1;
		} catch(SeckillClosedException e2){
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new SeckillException("Seckill inner error:" + e.getMessage());
		}
	}
	
	private String getMD5(long seckillId){
		String base =  seckillId + "/" +salt;
		String md5 = org.springframework.util.DigestUtils.md5DigestAsHex(base.getBytes());
		return md5;
	}
}

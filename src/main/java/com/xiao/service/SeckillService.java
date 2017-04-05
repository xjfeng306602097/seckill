/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.service;

import java.util.List;

import com.xiao.DTO.SeckillExcution;
import com.xiao.DTO.Exposer;
import com.xiao.bean.Seckill;
import com.xiao.exception.SeckillClosedException;
import com.xiao.exception.SeckillException;
import com.xiao.exception.SeckillRepeatException;

/**
 * @author Administrator
 *
 */
public interface SeckillService {
	/**
	 * 查询所有秒杀记录
	 * 
	 * @return
	 */
	List<Seckill> getSeckillList();

	/**
	 * 查询单个秒杀记录
	 * 
	 * @param seckillId
	 * @return
	 */
	Seckill getSeckillById(long seckillId);

	/**
	 * 秒杀开启时输出秒杀接口地址 否则输出系统时间和秒杀时间
	 * 
	 * @param seckillId
	 * @return
	 */
	Exposer exportSeckillUrl(long seckillId);

	/**
	 * 确认秒杀的时候判断是否秒杀成功
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 */
	SeckillExcution executeSeckill(long seckillId, long userPhone, String md5)
			throws Exception, SeckillException, SeckillRepeatException, SeckillClosedException;
}

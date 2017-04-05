/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.dao;

import org.apache.ibatis.annotations.Param;

import com.xiao.bean.SuccessKilled;

/**
 * @author Administrator
 *
 */
public interface SuccessKilledDao {
	/**
	 * 插入购买明细，可过滤重复
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	int insertSuccessKilled(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);
	
	/**
	 * 根据id查询Sucesskilled并携带秒杀产品对象实体
	 * @param seckiilId
	 * @return
	 */
	SuccessKilled querySuccessKilledWithId(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);
	
}

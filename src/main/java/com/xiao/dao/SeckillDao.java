/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiao.bean.Seckill;

/**
 * @author Administrator
 *
 */
public interface SeckillDao {
	
	/**
	 * 减库存
	 * @param seckillId
	 * @param killTime
	 * @return
	 */
	int reduceNumber(@Param("seckillId")long seckillId, @Param("killTime")Date killTime);
	
	/**
	 * 根据id查询对应的秒杀记录
	 * @param seckillId
	 * @return
	 */
	Seckill querySeckillById(long seckillId);
	
	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAllSeckill(@Param("offset")int offet, @Param("limit")int limit);
}

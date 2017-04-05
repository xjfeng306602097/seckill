/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.xiao.bean.Seckill;
import com.xiao.dao.SeckillDao;

public class SeckillTestCase extends BaseTestCase{
	
	@Resource
	private SeckillDao seckillDao;
	
	@Test
	public void seckillTest() {
		Seckill seckill = seckillDao.querySeckillById(100);
		System.out.println(seckill.toString());
	}
	
	@Test
	public void seckillReduceTest(){
		int i = seckillDao.reduceNumber(100l, new Date());
		System.out.println(i);
	}
	
	@Test
	public void sekillQueryAll(){
		List<Seckill> seckill = seckillDao.queryAllSeckill(0, 2);
		for (Seckill seckill2 : seckill) {
			System.out.println(seckill2.toString());
		}
	}
	
}

/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiao.DTO.SeckillExcution;
import com.xiao.DTO.Exposer;
import com.xiao.bean.Seckill;
import com.xiao.exception.SeckillClosedException;
import com.xiao.exception.SeckillException;
import com.xiao.exception.SeckillRepeatException;
import com.xiao.service.SeckillService;

/**
 * @author Administrator
 *
 */
public class SeckillServiceTestCase extends BaseTestCase {

	@Autowired
	private SeckillService seckillService;

	@Test
	public void test() {
		List<Seckill> seckill = seckillService.getSeckillList();
		for (Seckill seckill2 : seckill) {
			System.out.println(seckill2.toString());
		}
	}
	
	@Test
	public void testQuery() {
		Seckill seckill = seckillService.getSeckillById(100);
		System.out.println(seckill.toString());
	}
	
	@Test
	public void test1() {
		Exposer exposer = seckillService.exportSeckillUrl(100);
		System.out.println(exposer.toString());
		System.out.println(exposer.isExposed());
	}
	/**
	 * Exposer [exposed=true, md5=efe500c5f3484df3baa0bc4eb8dbd8ef, seckillId=100, now=0, start=0, end=0]
		true
	 * @throws Exception 
	 * @throws SeckillException 
	 * @throws SeckillClosedException 
	 * @throws SeckillRepeatException 
	 */
	
	@Test
	public void test2() throws SeckillRepeatException, SeckillClosedException, SeckillException, Exception{
		long seckillId = 100l;
		long userPhone = 181319040555l;
		String md5 = "efe500c5f3484df3baa0bc4eb8dbd8ef";
		SeckillExcution excution = seckillService.executeSeckill(seckillId, userPhone, md5);
		System.out.println(excution.toString());
	}
}

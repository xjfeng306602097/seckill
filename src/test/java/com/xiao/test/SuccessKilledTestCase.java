/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.test;

import javax.annotation.Resource;

import org.junit.Test;

import com.xiao.bean.SuccessKilled;
import com.xiao.dao.SuccessKilledDao;

/**
 * @author Administrator
 *
 */
public class SuccessKilledTestCase extends BaseTestCase {
	
	@Resource
	private SuccessKilledDao successKilledDao;

	@Test
	public void test() {
		int i = successKilledDao.insertSuccessKilled(100l, 18319040553l);
		System.out.println(i);
	}
	
	@Test
	public void test1(){
		SuccessKilled successKilled = successKilledDao.querySuccessKilledWithId(100l,18319040556l);
		System.out.println(successKilled.toString());
	}
	
}

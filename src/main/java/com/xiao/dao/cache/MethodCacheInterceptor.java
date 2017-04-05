/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.dao.cache;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Administrator 通过方法拦截器及aop定位对应serviceimpl.query开头方法,实现缓存
 */
public class MethodCacheInterceptor implements MethodInterceptor {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	@Qualifier("redisCacheService")
	private RedisCacheService redisCacheService;

	/**
	 * 先根据参数类型来实现获取schema，改进应为原方法返回类型来实现获取schema
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object value = null;
		// 方法返回的类型
		String targetName = invocation.getThis().getClass().getName();

		String methodName = invocation.getMethod().getName();
		Object[] arguments = invocation.getArguments();
		Class<?> clazz = invocation.getMethod().getReturnType();// 获取对应的返回类型来生成对应的schema
		String key = getCacheKey(targetName, methodName, arguments);
		try {
			if (redisCacheService.isExists(key)) {
				return redisCacheService.getCache(key, clazz);
			}
			// 执行方法
			value = invocation.proceed();
			if (value != null) {
				final String tkey = key;
				final Object tvalue = value;
				boolean flag = redisCacheService.putCache(tkey, tvalue);
				logger.debug("Key:" + tkey + "-->forCacheIsCreated=" + flag);
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (value == null) {
				return invocation.proceed();
			}
		}

		return value;
	}

	private String getCacheKey(String targetName, String methodName, Object[] arguments) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(targetName).append("_").append(methodName);
		if ((arguments != null) && (arguments.length != 0)) {
			for (int i = 0; i < arguments.length; i++) {
				stringBuffer.append("_").append(arguments[i]);
			}
		}
		return stringBuffer.toString();
	}
}

/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.dao.cache;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import Util.SerialzationUtil;
import redis.clients.jedis.Jedis;

/**
 * @author Administrator
 *
 */

public class RedisCacheServiceImpl implements RedisCacheService {

	private static Jedis jedis;

	// 默认一个小时
	private static int timeout = 60 * 60;

	@Resource
	@Qualifier("connectionFactory")
	private JedisConnectionFactory jedisConnectionFactory;

	@Override
	public boolean putCache(final String key, final Object obj) {
		byte[] bytes = SerialzationUtil.serializer(obj);
		String result = null;
		try {
			result = this.getJedis().setex(key.getBytes(), timeout, bytes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getJedis().close();
		}
		return result.equals("OK");
	}

	@Override
	public Object getCache(final String key, final Class<?> clazz) {
		// 反序列化
		Object obj = null;
		try {
			// byte[] bytes-->Object
			byte[] bytes = this.getJedis().get(key.getBytes());// 获取二进制数组
			obj = SerialzationUtil.deserializer(bytes, clazz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.getJedis().close();
		}
		return obj;
	}

	/**
	 * 
	 */
	@Override
	public boolean hashSet(String key, String field, Object obj) {
		byte[] bytes = SerialzationUtil.serializer(obj);
		Long result = null;
		try {
			result = this.getJedis().hset(key.getBytes(), field.getBytes(), bytes);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getJedis().close();
		}
		return result.equals(1);
	}

	@Override
	public Object hashGet(String key, String field, Class<?> clazz) {
		Object obj = null;
		try {
			byte[] bytes = this.getJedis().hget(key.getBytes(), field.getBytes());
			// 反序列化
			obj = SerialzationUtil.deserializer(bytes, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getJedis().close();
		}
		return obj;
	}

	/**
	 * 清除redisDB
	 */
	@Override
	public String flushDB() {
		return this.getJedis().flushDB();
	}

	/**
	 * 删除对应的key
	 */
	@Override
	public void delKey(String key) {
		this.getJedis().del(key.getBytes());
	}

	/**
	 * 判断是否存在对应key
	 */
	@Override
	public boolean isExists(String key) {
		return this.getJedis().exists(key.getBytes());
	}

	/**
	 * 获取jedisClient
	 * 
	 * @return
	 */
	private Jedis getJedis() {
		if (jedis == null) {
			return jedisConnectionFactory.getShardInfo().createResource();
		}
		return jedis;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

}

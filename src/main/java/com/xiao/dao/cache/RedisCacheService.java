/**
 * @author xiaojunfeng
 * @version 1.0
 */
package com.xiao.dao.cache;

/**
 * @author Administrator
 *
 */
public interface RedisCacheService {
	
	public boolean putCache(String key, Object obj);
	
	public Object getCache(String key, Class<?> clazz);
	
	public String flushDB();
	
	public void delKey(String key);
	
	public boolean isExists(String key);
	
	public boolean hashSet(String key, String field, Object obj);
	
	public Object hashGet(String key, String field, Class<?> clazz);
}

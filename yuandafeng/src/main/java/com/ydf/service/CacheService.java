package com.ydf.service;

public interface CacheService {
	/**
	 * 根据key 获取缓存
	 * 
	 * @param key
	 * @return
	 */
	Object getCacheCode(String key, String cacheKey);

	/**
	 * 写缓存缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	void pushCacheCode(String key, Object value, String cacheKey);
	
	
	/**
	 * 删除缓存缓存
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	void removeCacheCode(String key, String cacheKey);
}

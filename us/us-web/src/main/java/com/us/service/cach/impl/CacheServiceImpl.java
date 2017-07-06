package com.us.service.cach.impl;

import javax.annotation.Resource;




import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.us.service.cach.CacheService;

@Service
public class CacheServiceImpl implements CacheService{

	@Resource
	CacheManager cacheManager;
	
	@Override
	public Object getCacheCode(String key, String cacheKey) {
		Cache<String,Object> cach =cacheManager.getCache(cacheKey);
		if(cach!=null)return cach.get(key);
		return null;
	}

	@Override
	public void pushCacheCode(String key, Object value, String cacheKey) {
		Cache<String,Object> cach =cacheManager.getCache(cacheKey);
		if(cach!=null) cach.put(key,value);
	}

	@Override
	public void removeCacheCode(String key, String cacheKey) {
		Cache<String, Object> captchaCache = cacheManager.getCache(cacheKey);
		captchaCache.remove(key);
	}

}

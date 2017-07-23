package com.ydf.service.impl;

import javax.annotation.Resource;

import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.stereotype.Service;

import com.ydf.service.CacheService;


@Service
public class CacheServiceImpl implements CacheService{

	@Resource
	CacheManager cacheManager;
	
	@Override
	public Object getCacheCode(String key, String cacheKey) {
		Cache cach =cacheManager.getCache(cacheKey);
		
		if(cach!=null){
			ValueWrapper value = cach.get(key);
			if (value instanceof SimpleValueWrapper)
			{
				return ((SimpleValueWrapper) value).get();
			}	
		}
		return null;
	}

	@Override
	public void pushCacheCode(String key, Object value, String cacheKey) {
		Cache cach =cacheManager.getCache(cacheKey);
		if(cach!=null) cach.put(key,value);
	}

	@Override
	public void removeCacheCode(String key, String cacheKey) {
		Cache captchaCache = cacheManager.getCache(cacheKey);
		captchaCache.evict(key);
	}

}

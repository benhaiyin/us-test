package com.us.service.cache.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.stereotype.Service;

import com.us.service.cache.CacheService;

import net.sf.ehcache.Ehcache;

@Service
public class CacheServiceImpl implements CacheService{

	@Resource
	CacheManager cacheManager;
	
	@Override
	public Object getCacheCode(String key, String cacheKey) {
		Cache cach =cacheManager.getCache(cacheKey);
		
		if(cach!=null){
			ValueWrapper value = cach.get(key);
			if (value!=null && value instanceof SimpleValueWrapper)
			{
				return ((SimpleValueWrapper) value).get();
			}	
		}
		keys();
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

	public void keys () {
		Collection<String> ehcache = cacheManager.getCacheNames();
		System.out.println(ehcache.size());
	}
}

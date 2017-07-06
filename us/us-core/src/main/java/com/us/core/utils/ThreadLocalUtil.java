package com.us.core.utils;

public class ThreadLocalUtil
{
	private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

	public static String getAppKey()
	{
		return threadLocal.get();
	}

	public static void setAppKey(String appKey)
	{
		threadLocal.set(appKey);
	}
}
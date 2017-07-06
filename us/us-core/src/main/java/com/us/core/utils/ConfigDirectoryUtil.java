package com.us.core.utils;

import java.io.File;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 

/**
 * 工具类 - 获取配置文件目录
 * 
 * @author wumenghua
 * @version V1.0
 */

public class ConfigDirectoryUtil
{
	private static Logger logger = LoggerFactory.getLogger(ConfigDirectoryUtil.class);
	// 默认配置文件名
	private final static String propertiesName = "common.properties";
	// 配置文件默认目录
	private final static String defaultConfigersName = "configers";
	// 存放配置文件的propertie
	private static Properties propertie = new Properties();
	private static String classPath = "";
	static
	{
		// 获取默认配置文件
		getCommonProp();
	}

	public static void getCommonProp()
	{
		getClassPath();
		try
		{
			File fileproperties = new File(classPath + propertiesName);
			propertie = PropertiesUtils.readProperties(fileproperties);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
		}
	}

	public static void getClassPath()
	{
		classPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String target = "target/test-classes/";
		if (classPath.endsWith(target))
		{
			classPath = classPath.replace(target, "src/main/resources/");
		}
	}

	/**
	 * 获取配置文件目录路径
	 * 
	 * @return String的配置文件目录路径
	 */
	public static String getConfigPath()
	{
		if (null == propertie)
		{
			propertie = new Properties();
			getCommonProp();
		}
		String configPath = propertie.getProperty("configPath");
		if (null == propertie || null == configPath || "default".equals(configPath))
		{
			return classPath;
		}
		else if (".".equals(configPath))
		{
			configPath = System.getProperties().getProperty("user.home") + File.separator + defaultConfigersName;
		}
		return configPath;
	}

	/**
	 * 获取配置文件路径
	 * 
	 * @param name
	 * @return file 绝对路径
	 */
	public static String getConfigPath(String name)
	{
		return getConfigPath() + File.separator + name;
	}
}

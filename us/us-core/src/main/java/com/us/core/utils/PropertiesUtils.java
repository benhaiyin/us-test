package com.us.core.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * 配置文件读取工具类
 * 
 */
public class PropertiesUtils
{
	private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);

	/**
	 * 读取配置文件
	 * 
	 * @param file
	 * @return
	 */
	public static Properties readProperties(File file)
	{
		Properties propertie = new Properties();
		InputStream propertiesInputStream;
		try
		{
			propertiesInputStream = new FileInputStream(file);
			BufferedReader configurationRead;
			configurationRead = new BufferedReader(new InputStreamReader(propertiesInputStream, "UTF-8"));
			propertie.load(configurationRead);
		}
		catch (FileNotFoundException | UnsupportedEncodingException e)
		{
			logger.error("读取配置文件失败！", e);
		}
		catch (IOException e)
		{
			logger.error("读取配置文件失败！", e);
		}
		return propertie;
	}

	/**
	 * 读取配置文件
	 * 
	 * @param file
	 * @return
	 */
	public static Properties readProperties(String filePath)
	{
		File file = new File(filePath);
		Properties propertie = readProperties(file);
		return propertie;
	}
}

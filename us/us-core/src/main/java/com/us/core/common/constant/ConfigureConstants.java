package com.us.core.common.constant;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

import com.us.core.utils.ConfigDirectoryUtil;
import com.us.core.utils.PropertiesUtils;

/**
 * 配置文件的键值属性
 */
public class ConfigureConstants {
	
	public static final String BASE_PATH="basePath";
	public static final String STATIC_PATH="staticPath";
	
	public static Map<String,String> urlConstantMap = new HashMap<String,String>();
	
	private static final String configurePath="configure.properties";
	
	static{
		String path = ConfigDirectoryUtil.getConfigPath(configurePath);
		Properties prop = PropertiesUtils.readProperties(path);
		if(prop!=null){
			Set<Entry<Object, Object>> entrySet =prop.entrySet();
			for(Entry<Object,Object> entry:entrySet){
				String locationKey = ((String) entry.getKey()).trim();
				String locationValue = ((String) entry.getValue()).trim();
				urlConstantMap.put(locationKey, locationValue);
			}
		}
	}
	
}

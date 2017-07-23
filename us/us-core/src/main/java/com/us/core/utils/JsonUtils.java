package com.us.core.utils;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.us.core.modules.mapper.JsonMapper;

public abstract class JsonUtils {
	 private static JsonMapper binder = new JsonMapper(Include.ALWAYS);
	 
	 /**
	  * 对象转换成json字符串
	  * @param object
	  * @return
	  */
	 public static String objToJson(Object object){
			return binder.toJson(object);
	 }
	
	 public static <T> T json2Object(String jsonString, TypeReference<T> typeReference)
	{
		if (StringUtils.isEmpty(jsonString))
		{
			return null;
		}
		return (T) binder.fromJson(jsonString, typeReference);
	}

}

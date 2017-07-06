package com.us.core.utils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
			

}

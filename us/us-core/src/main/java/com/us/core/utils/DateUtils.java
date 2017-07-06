package com.us.core.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangtao
 */
public abstract class DateUtils {

    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

     /**
      *  当前时间
      * @return
      */
    public static Date now() {
        return new Date();
    }

    /**
     * 日期转换成默认的字符串（yyyy-MM-dd HH:mm:ss）
     * @param date
     * @return
     */
    public static String dateToStr(Date date) {
        return dateToStr(date, DEFAULT_DATE_TIME_FORMAT);
    }

    /**
     * 日期转换成指定格式的字符串
     * @param date
     * @param pattern
     * @return
     */
    public static String dateToStr(Date date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        }
        DateFormat format = new SimpleDateFormat(pattern);
    	return format.format(date);
    }


}
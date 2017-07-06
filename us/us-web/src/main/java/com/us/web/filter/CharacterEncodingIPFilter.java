package com.us.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.us.web.utils.WebUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 2016/1/30
 *
 */
public class CharacterEncodingIPFilter extends CharacterEncodingFilter {

    private static final Logger LOG = LoggerFactory.getLogger(CharacterEncodingIPFilter.class);


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        recordIP(request);
        accessOrigin(response);
        super.doFilterInternal(request, response, filterChain);
    }

    private void recordIP(HttpServletRequest request) {
        final String ip = WebUtils.retrieveClientIp(request);
        WebUtils.setIp(ip);
        LOG.debug("Send request uri: {}, from IP: {}", request.getRequestURI(), ip);
    }
    
    private void accessOrigin(HttpServletResponse response){
    	logger.debug("----------------添加跨域访问----------------");
    	response.addHeader("Access-Control-Allow-Origin", "*");

    	response.setContentType("application/json;charset=UTF-8");//防止数据传递乱码

	    logger.debug("--------------- 添加跨域访问 end----------------");
    }
}

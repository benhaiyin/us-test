package com.us.web.filter.security;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AccessVerificationFilter extends AccessControlFilter{
	private static Logger logger = LoggerFactory.getLogger(AccessVerificationFilter.class);
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		Subject subject = getSubject(request, response);  
        String[] rolesArray = (String[]) mappedValue;  

        if (rolesArray == null || rolesArray.length == 0) {  
            return true;  
        }  
        boolean flag = false;  
        Set<String> roles = CollectionUtils.asSet(rolesArray);  
        for (String string : roles) {  
            if(subject.hasRole(string)){  
                flag = true;  
            }
        }  
        return flag; 
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		try
		{
			response.setContentType("text/plain;charset=UTF-8");
			response.getWriter().write("您的登录已过期，请重新登录");
			response.getWriter().flush();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return false;
	}

}

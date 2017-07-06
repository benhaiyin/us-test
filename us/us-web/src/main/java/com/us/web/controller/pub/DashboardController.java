package com.us.web.controller.pub;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.us.core.common.constant.UsConstants;

@Controller
@Scope("prototype")
@RequestMapping("manage")
public class DashboardController {
	
	/**
	 * 页面跳转
	 * @param jspName 页面名不包括us-
	 * @return
	 */
	@RequestMapping("page/{jspName}")
	public ModelAndView dashboardPage(HttpServletRequest request ,@PathVariable String jspName){
		ModelAndView view = new ModelAndView(UsConstants.US_PERFIX.concat(jspName));
		return view;
	}
}

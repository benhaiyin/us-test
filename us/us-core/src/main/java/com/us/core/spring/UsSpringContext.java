package com.us.core.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class UsSpringContext implements ApplicationContextAware{

		private static ApplicationContext context = null;
 
		public static ApplicationContext getApplicationContext() {
		  return context ;
		}

		public static Object getBean(String beanName) {
		  return context== null ? null: context.getBean(beanName);
		}


		@Override
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			context = applicationContext;
		}

}

package com.ldb.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ProjectName: spring
 * @Package: com.ldb.util
 * @ClassName: SpringContextHolderTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/6/26 0:43
 * @Version: 1.0
 */

public class SpringContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextHolder.applicationContext = applicationContext;
	}

	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}
}

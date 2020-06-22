package com.ldb.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.ldb.postprocess
 * @ClassName: LdbDaoImplPostProcess
 * @Author: LJP
 * @Description:
 * @Date: 2020/5/23 22:08
 * @Version: 1.0
 */
@Component
public class LdbDaoImplPostProcess implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

//		System.out.println("-------- LdbDaoImplPostProcess -----------");
//		GenericBeanDefinition ldbDaoImpl1 = (GenericBeanDefinition) beanFactory.getBeanDefinition("ldbDaoImpl1");
//		ldbDaoImpl1.setAutowireMode(2);
	}
}

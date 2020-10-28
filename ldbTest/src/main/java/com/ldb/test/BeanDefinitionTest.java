package com.ldb.test;

import com.ldb.app.AppConfig;
import com.ldb.app.LdbConfig;
import com.ldb.dao.LdbDao;
import com.ldb.dao.impl.LdbDaoImpl1;
import com.ldb.entity.po.Ldb;
import com.ldb.service.impl.LdbserviceImpl;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @ProjectName: spring
 * @Package: com.ldb.test
 * @ClassName: BeanDefinitionTest
 * @Author: LJP
 * @Description: BeanDefinition测试类
 * @Date: 2020/6/25 22:33
 * @Version: 1.0
 */
public class BeanDefinitionTest {

	public static void main(String[] args) {
		annotationConfigApplicationContextTest();
//		classPathXmlApplicationContextTest();
	}

	public static void annotationConfigApplicationContextTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanDefinition ldbserviceImplBD = ac.getBeanDefinition("getLdb");
		System.out.println(ldbserviceImplBD.getClass().getSimpleName());
		ac.register(LdbDaoImpl1.class);
		LdbDao ldbDaoImpl1 = (LdbDao) ac.getBean("ldbDaoImpl1");
		ldbDaoImpl1.query();
		LdbDao ldbDaoImpl2 = (LdbDao) ac.getBean("ldbDaoImpl2");
		ldbDaoImpl2.query();
	}

	public static void classPathXmlApplicationContextTest(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		BeanDefinition ldbserviceImplBD = ac.getBeanFactory().getBeanDefinition("ldbserviceImpl");
		System.out.println(ldbserviceImplBD.getClass().getSimpleName());
		LdbserviceImpl ldbserviceImpl = (LdbserviceImpl)ac.getBean("ldbserviceImpl");
//		Object ldbDaoImpl2 = ac.getBean("ldbDaoImpl2");
//		System.out.println(ldbDaoImpl2);
		ldbserviceImpl.queryService();
	}
}

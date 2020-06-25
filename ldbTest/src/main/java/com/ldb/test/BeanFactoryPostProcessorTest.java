package com.ldb.test;

import com.ldb.app.AppConfig;
import com.ldb.dao.LdbDao;
import com.ldb.dao.impl.LdbDaoImpl1;
import com.ldb.util.ScanPackageHandler;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.ldb.test
 * @ClassName: BeanFactoryPostProcessorTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/6/26 1:08
 * @Version: 1.0
 */
public class BeanFactoryPostProcessorTest {

	public static void main(String[] args) {
		annotationConfigApplicationContextTest();
//		classPathXmlApplicationContextTest();
	}

	public static void annotationConfigApplicationContextTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		// 处理包扫描
		ac.scan("com.ldb");
		ac.register(AppConfig.class);
		BeanDefinition ldbserviceImplBD = ac.getBeanDefinition("ldbserviceImpl");
		System.out.println(ldbserviceImplBD.getClass().getSimpleName());
		ScanPackageHandler sp = new ScanPackageHandler(ac);
		sp.scan("com.ldb");
		ac.refresh();
		LdbDao ldbDaoImpl = (LdbDao) ac.getBean("ldbDaoImpl1");
		System.out.println(ldbDaoImpl.getClass().getSimpleName());

	}

	public static void classPathXmlApplicationContextTest(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		BeanDefinition ldbserviceImplBD = ac.getBeanFactory().getBeanDefinition("ldbserviceImpl");
		System.out.println(ldbserviceImplBD.getClass().getSimpleName());
	}
}

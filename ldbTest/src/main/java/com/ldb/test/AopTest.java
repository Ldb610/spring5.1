package com.ldb.test;

import com.ldb.app.AppConfig;
import com.ldb.dao.LdbDao;
import com.ldb.dao.impl.LdbDaoImpl1;
import com.ldb.dao.impl.LdbDaoImpl3;
import com.ldb.util.ScanPackageHandler;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.ldb.test
 * @ClassName: AopTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/6/26 22:45
 * @Version: 1.0
 */
public class AopTest {

	public static void main(String[] args) {
		annotationConfigApplicationContextTest();
//		classPathXmlApplicationContextTest();
	}

	public static void annotationConfigApplicationContextTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ScanPackageHandler sph = new ScanPackageHandler(ac);
		sph.scan("com.ldb");
		LdbDaoImpl3 ldbDaoImpl3 = (LdbDaoImpl3) ac.getBean("ldbDaoImpl3");
		LdbDaoImpl3 ldbDaoImpl31 = new LdbDaoImpl3();
		ldbDaoImpl31.query();
	}

	public static void classPathXmlApplicationContextTest(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		BeanDefinition ldbserviceImplBD = ac.getBeanFactory().getBeanDefinition("ldbserviceImpl");
		System.out.println(ldbserviceImplBD.getClass().getSimpleName());
	}
}

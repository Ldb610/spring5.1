package com.ldb.test;

import com.ldb.app.AppConfig;
import com.ldb.dao.LdbDao;
import com.ldb.dao.impl.LdbDaoImpl;
import com.ldb.dao.impl.LdbDaoImpl1;
import com.ldb.entity.po.Ldb;
import com.ldb.entity.po.LdbFactoryBean;
import com.ldb.service.LdbService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.ldb.test
 * @ClassName: LdbTest
 * @Author: LJP
 * @Description:
 * @Date: 2019/8/15 22:32
 * @Version: 1.0
 */

public class LdbTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ac =
//				new AnnotationConfigApplicationContext();
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
//		LdbDao ldbDao = (LdbDao) annotationConfigApplicationContext.getBean("ldbDaoImpl");
//		LdbService ldbService = (LdbService) annotationConfigApplicationContext.getBean("ldbserviceImpl");
//		ac.getEnvironment().setActiveProfiles("develop");

		// lookupRes 这段代码为啥在
		System.out.println("-------- 手动 register -----------");
//		ac.getBeanFactory().registerSingleton("ldbDaoImpl",new LdbDaoImpl());
//		ac.getBeanFactory().registerSingleton("ldbDaoImpl1",new LdbDaoImpl1());

//		ac.register(AppConfig.class);
//		ac.refresh();

		Ldb ldb = (Ldb) ac.getBean("getLdbFactoryBean");
		LdbFactoryBean ldb1 = (LdbFactoryBean) ac.getBean("&getLdbFactoryBean");
//		LdbDaoImpl1 ldbDaoImpl1 = (LdbDaoImpl1) ac.getBean("ldbDaoImpl1");
		LdbService ldbService = (LdbService) ac.getBean("ldbserviceImpl");
//		ConfigurableEnvironment environment =  annotationConfigApplicationContext.getEnvironment();
//		ldbService.queryService();
		System.out.println(ldb);
//		System.out.println(ldb);
		System.out.println(ldb1);
//		System.out.println(ldbDaoImpl1.getLdbDaoImpl());
		ldbService.queryService();
	}
}

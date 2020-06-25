package com.ldb.util;

import com.ldb.app.LdbConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.ldb.service.impl
 * @ClassName: SmartLifecycleTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/5/23 18:53
 * @Version: 1.0
 */
@Component
public class SmartLifecycleTest implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("启动了");
		AnnotationConfigApplicationContext ac = (AnnotationConfigApplicationContext) SpringContextHolder.getApplicationContext();
		System.out.println(ac.getBean("getLdb"));
		System.out.println(ac.getBean("ldbDaoImpl"));
		AnnotatedBeanDefinitionReader abd = new AnnotatedBeanDefinitionReader(ac);
		abd.registerBean(LdbConfig.class);

	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public boolean isAutoStartup() {
		//当这个返回true 的时候自动调用start方法
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		// 如果手动调用 run 方法的话在容器停止的时候就会直接停止
		// 如果没调用的话会延迟30秒关闭
//		callback.run();
	}

	@Override
	public int getPhase() {
		// 优先级，返回数值越低，优先级越高
		return 0;
	}
}

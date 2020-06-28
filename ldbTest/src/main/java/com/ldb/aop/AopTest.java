package com.ldb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.ldb.aop
 * @ClassName: AopTest
 * @Author: LJP
 * @Description:
 * @Date: 2020/6/26 22:25
 * @Version: 1.0
 */
@Component
@Aspect
public class AopTest {


	@Pointcut("@annotation(com.ldb.annotation.LdbAop)")
	public void pointCut(){
	}

	@Before("pointCut()")
	public void before(JoinPoint joinPoint){
		System.out.println("aop 增强");

	}
}

package com.ldb.dao.impl;

import com.ldb.annotation.LdbAop;
import com.ldb.annotation.LdbScan;
import com.ldb.dao.LdbDao;
import com.ldb.util.SpringContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.ldb.dao.impl
 * @ClassName: LdbDaoImpl
 * @Author: LJP
 * @Description:
 * @Date: 2019/8/15 22:29
 * @Version: 1.0
 */
//@Repository
//@LdbScan
public class LdbDaoImpl3{
	LdbDao ldbDaoImpl;

	ApplicationContext applicationContext = SpringContextHolder.getApplicationContext();

	public LdbDao getLdbDaoImpl() {
		return ldbDaoImpl;
	}

	public void setLdbDaoImpl(LdbDao ldbDaoImpl) {
		this.ldbDaoImpl = ldbDaoImpl;
	}

	@LdbAop
	public void query() {
		LdbDaoImpl3 ldbDaoImpl3 = (LdbDaoImpl3) applicationContext.getBean("ldbDaoImpl3");
		ldbDaoImpl3.query1();
	}

	@LdbAop
	public void query1() {
		System.out.println("query2");
	}

}

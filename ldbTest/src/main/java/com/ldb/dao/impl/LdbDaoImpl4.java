package com.ldb.dao.impl;

import com.ldb.annotation.LdbAop;
import com.ldb.annotation.LdbScan;
import com.ldb.dao.LdbDao;
import com.ldb.util.SpringContextHolder;
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
public class LdbDaoImpl4 extends LdbDaoImpl3{

	@Override
	@LdbAop
	public void query1() {
		System.out.println("query4");
	}

}

package com.ldb.dao.impl;

import com.ldb.annotation.LdbScan;
import com.ldb.dao.LdbDao;
import com.ldb.entity.po.Ldb;
import org.springframework.stereotype.Repository;

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
public class LdbDaoImpl1 implements LdbDao {
	LdbDao ldbDaoImpl;

	public LdbDao getLdbDaoImpl() {
		return ldbDaoImpl;
	}

	public void setLdbDaoImpl(LdbDao ldbDaoImpl) {
		this.ldbDaoImpl = ldbDaoImpl;
	}

	@Override
	public void query() {
		System.out.println("query1");
	}
}

package com.ldb.dao.impl;

import com.ldb.dao.LdbDao;
import org.springframework.context.annotation.Conditional;
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
public class LdbDaoImpl implements LdbDao {
	@Override
	public void query() {
		System.out.println("query");
	}
}

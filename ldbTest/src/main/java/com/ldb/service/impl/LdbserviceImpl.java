package com.ldb.service.impl;

import com.ldb.dao.LdbDao;
import com.ldb.dao.impl.LdbDaoImpl;
import com.ldb.service.LdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring
 * @Package: com.ldb.service.impl
 * @ClassName: LdbserviceImpl
 * @Author: LJP
 * @Description:
 * @Date: 2019/8/15 23:33
 * @Version: 1.0
 */
@Service
public class LdbserviceImpl implements LdbService {

	/**
	 * 这个时候注入的是 LdbDaoImpl 这个实现类
	 * @param ldbDaoImpl
	 */
//	public LdbserviceImpl(LdbDao ldbDaoImpl) {
//		this.ldbDaoImpl = ldbDaoImpl;
//	}

	private LdbDao ldbDaoImpl;

	public void setLdbDaoImpl(LdbDao ldbDaoImpl) {
		this.ldbDaoImpl = ldbDaoImpl;
	}

	//	@Autowired
//	private LdbDao ldbDaoImpl;
	@Override
	public void queryService() {
		ldbDaoImpl.query();
		System.out.println("queryService");
	}
}

package com.ldb.entity.po;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ProjectName: spring
 * @Package: com.ldb.entity.po
 * @ClassName: ldbFactoryBean
 * @Author: LJP
 * @Description:
 * @Date: 2019/8/16 23:19
 * @Version: 1.0
 */
public class LdbFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new Ldb();
	}

	@Override
	public Class<?> getObjectType() {
		return Ldb.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}

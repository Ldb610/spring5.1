package com.ldb.app;

import com.ldb.dao.impl.LdbDaoImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: spring
 * @Package: com.ldb.app
 * @ClassName: LdbConfig
 * @Author: LJP
 * @Description:
 * @Date: 2020/6/26 2:36
 * @Version: 1.0
 */
@Configuration
public class LdbConfig {

	@Bean
	public LdbDaoImpl2 ldbDaoImpl2(){
		return new LdbDaoImpl2();
	}
}

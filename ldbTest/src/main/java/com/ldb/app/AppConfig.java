package com.ldb.app;

import com.ldb.entity.po.Ldb;
import com.ldb.entity.po.LdbFactoryBean;
import com.ldb.util.SpringContextHolder;
import org.springframework.context.annotation.*;

/**
 * @ProjectName: spring
 * @Package: com.ldb.app
 * @ClassName: AppConfig
 * @Author: LJP
 * @Description:
 * @Date: 2019/8/15 22:18
 * @Version: 1.0
 */
@Configuration
@ComponentScan("com.ldb")
public class AppConfig {


	@Bean
//	@Profile("develop")
	@Scope("singleton")
	public Ldb getLdb(){
		return new Ldb();
	}

	@Bean
	public Object getLdbFactoryBean(){
		return new LdbFactoryBean();
	}


	@Bean
	@Scope("singleton")
	public SpringContextHolder springContextHolder(){
		return new SpringContextHolder();
	}

}

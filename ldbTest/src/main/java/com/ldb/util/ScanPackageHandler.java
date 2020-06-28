package com.ldb.util;

import com.ldb.annotation.LdbScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * @ProjectName: spring
 * @Package: com.ldb.util
 * @ClassName: ScanPackageHandler
 * @Author: LJP
 * @Description: 自定义的包扫描类
 * @Date: 2020/6/26 1:46
 * @Version: 1.0
 */
public class ScanPackageHandler extends ClassPathBeanDefinitionScanner {

	public ScanPackageHandler(BeanDefinitionRegistry registry) {
		super(registry);
		addIncludeFilter(new AnnotationTypeFilter(LdbScan.class));
	}

}

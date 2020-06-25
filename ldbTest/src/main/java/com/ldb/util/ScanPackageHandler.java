package com.ldb.util;

import com.ldb.annotation.LdbScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.lang.annotation.Annotation;

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

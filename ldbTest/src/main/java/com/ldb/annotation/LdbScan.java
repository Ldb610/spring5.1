package com.ldb.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @ProjectName: spring
 * @Package: com.ldb.annotation
 * @ClassName: LdbScan
 * @Author: LJP
 * @Description: ldb扫描注解
 * @Date: 2020/6/26 2:05
 * @Version: 1.0
 */
@Reference
@Target(ElementType.TYPE)
public @interface LdbScan {
}

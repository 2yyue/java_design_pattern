package com.fatey.liu.demo01;

import java.lang.annotation.*;

/**
 * @author Liu Fatey
 * @description 类描述注解类使用@interface关键字修饰
 * 元注解@Target@Rentention@Documented
 * @created 2024/10/4 下午9:25
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatSubmit {
	int timeout() default 500;
	
	String name() default "";
}


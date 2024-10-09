package com.fatey.liu.demo01;

import java.lang.reflect.Method;

/**
 * @author Liu Fatey
 * @description 类描述
 * @created 2024/10/4 下午9:34
 */
public class RepeatSubmitHandler {
	void rsHandler() {
		final Class<TestController> testControllerClass = TestController.class;
		final Method[] declaredMethods = testControllerClass.getDeclaredMethods();
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(RepeatSubmit.class)) {
				RepeatSubmit repeatSubmit = method.getAnnotation(RepeatSubmit.class);
				int timeout = repeatSubmit.timeout();
				String name = repeatSubmit.name();
				System.out.println("timeout: " + timeout + ", name: " + name);
			}
			
		}
	}
}

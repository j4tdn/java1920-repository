package lesson25.springaop.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import lesson25.springaop.utils.Logger;

public class SpringAopLogBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\n---- SpringAopLogBefore ----");
		
		System.out.println(">> ** method name = " + method.getName());
		System.out.println(">> ** method parameter count = " + method.getParameterCount());
		
		Logger.log();
		
		System.out.println("---- SpringAopLogBefore ----");
		
	}
	
	
	
}

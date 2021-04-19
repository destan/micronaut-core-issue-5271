package com.example;

import io.micronaut.aop.InterceptorBean;
import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;

import javax.inject.Singleton;

@Singleton
@InterceptorBean(SomeAnnotation.class)
public class SomeInterceptor implements MethodInterceptor<Object, Object> {

	@Override
	public Object intercept(MethodInvocationContext<Object, Object> context) {

		System.out.println("########## INTERCEPTED %s#%s ##########".formatted(context.getTarget(), context.getTargetMethod().getName()));

		return context.proceed();
	}
}
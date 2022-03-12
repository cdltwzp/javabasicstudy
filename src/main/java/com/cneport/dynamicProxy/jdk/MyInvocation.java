package com.cneport.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler {

	private TargetInterface targetInterface;
	
	
	public MyInvocation(TargetInterface targetInterface) {
		super();
		this.targetInterface = targetInterface;
	}

/**
 * @param proxy jdk创建的代理对象，无需赋值。
 * @return 代理方法执行结果
 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		method.invoke(targetInterface, args);
		System.out.println("你被代理了");
		return null;
	}

}

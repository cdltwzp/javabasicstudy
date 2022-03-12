package com.cneport.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		TargetInterface targetInterface = new TargetImpl();
		InvocationHandler invocationHandler = new MyInvocation(targetInterface);
		TargetInterface newProxyInstance = (TargetInterface)Proxy.newProxyInstance(targetInterface.getClass().getClassLoader(), targetInterface.getClass().getInterfaces(), invocationHandler);
		newProxyInstance.sayHello("张三");
	}

}

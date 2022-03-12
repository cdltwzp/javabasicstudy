package com.cneport.dynamicProxy.jdk;

/**
 * 目标类
 * @author admin
 *
 */
public class TargetImpl implements TargetInterface {

	@Override
	public void sayHello(String name) {

		System.out.println("你好 ： " + name);
	}

}

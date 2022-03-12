package com.cneport.dynamicProxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class TargetClass {

	public static void main(String[] args) {
		//System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./");  
		
		  //可以指定 CGLIB 将动态生成的代理类保存至指定的磁盘路径下
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"本地磁盘路径");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Son.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Son student = (Son)enhancer.create();
        student.fatherMethod();
        student.sonMethod();
	}
}

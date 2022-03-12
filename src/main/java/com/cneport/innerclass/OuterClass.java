package com.cneport.innerclass;
/**
 * 内部类一共有三种 
 * 1. 非静态内部类
 * 2. 静态内部类
 * 3. 匿名内部类 主要用于new 接口/抽象类
 * @author wzpcd
 *
 */
public class OuterClass {
    private String outerClassName;
    public class InnerClass {
	private String innerclassName;
	
    public InnerClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void innerMethod() {
		outerClassName = "outClassName";
    	System.out.println(" innerMethod ");
    }
	public String getClassName() {
		return innerclassName;
	}

	public void setClassName(String className) {
		this.innerclassName = className;
	}
	
	public void outerMethod() {
		innerclassName = "innerclassName";
    	System.out.println(" outerMethod ");
    }
 }
 
 public static class InnerStaticClass {
	private String className;
	
    public InnerStaticClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void innerMethod() {
    	System.out.println(" static innerMethod ");
    }
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
 }
 
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.innerMethod();
		
	/*	OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
		innerStaticClass.innerMethod();*/
	} 
}

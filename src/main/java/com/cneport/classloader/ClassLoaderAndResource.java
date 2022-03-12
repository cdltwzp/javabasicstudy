package com.cneport.classloader;

public class ClassLoaderAndResource {
public static void main(String[] args) {
	//file:/D:/work/workspace/JavaBasicStudy/target/classes/com/cneport/classloader/
	System.out.println(ClassLoaderAndResource.class.getResource(""));
	//file:/D:/work/workspace/JavaBasicStudy/target/classes/
	System.out.println(ClassLoaderAndResource.class.getResource("/"));
	//file:/D:/work/workspace/JavaBasicStudy/target/classes/
	System.out.println(ClassLoaderAndResource.class.getClassLoader().getResource(""));
	//null
	System.out.println(ClassLoaderAndResource.class.getClassLoader().getResource("/"));
}
}

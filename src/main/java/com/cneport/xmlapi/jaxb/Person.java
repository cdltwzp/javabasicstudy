package com.cneport.xmlapi.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * xml实体
 * @author wzpcd
 *
 */
@XmlRootElement
public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


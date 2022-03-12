package com.cneport.xmlapi.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * jaxb 全称 java architecture for xml binding 主要负责将xml映射为java对象
 * @author wzpcd
 *
 */
public class XmlConverToObj {
public static void main(String[] args) throws JAXBException {
	JAXBContext newInstance = JAXBContext.newInstance(Person.class);
	Unmarshaller createUnmarshaller = newInstance.createUnmarshaller();
	Person person = (Person)createUnmarshaller.unmarshal(new File("./src/main/resource/person.xml"));
	System.out.println(person.getAge());
	System.out.println(person.getName());
}
}

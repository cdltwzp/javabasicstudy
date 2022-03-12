package com.cneport.xmlapi.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * jaxb 全称 java architecture for xml binding 主要负责将xml映射为java对象
 * @author wzpcd
 *
 */
public class ObjConverToXml {
public static void main(String[] args) throws JAXBException {
	//上下文
	JAXBContext newInstance = JAXBContext.newInstance(Person.class);
	Marshaller createMarshaller = newInstance.createMarshaller();
	Person person = new Person();
	person.setName("张三");
	person.setAge(23);
	createMarshaller.marshal(person,new File("./src/main/resource/person2.xml"));

}
}

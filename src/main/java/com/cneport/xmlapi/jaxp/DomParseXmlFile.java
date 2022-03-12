package com.cneport.xmlapi.jaxp;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * jaxp(the java api for processing 主要负责解析xml
 * @author wzpcd
 *dom解析xml将xml内容完全加载进内存生成一个与xml文档内容对应的对象模型。当解析完成时，内存中会生成一个与xml文档结构对应的dom对象树
 */
public class DomParseXmlFile {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder newDocumentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = newDocumentBuilder.parse(new File("./resource/person.xml"));
		
		Element rootElement = document.getDocumentElement();
		NodeList childNodes = rootElement.getChildNodes();
	
		for (int i = 0; i < childNodes.getLength(); i++) {//换行也打印出来了
			Node item = childNodes.item(i);
			System.out.println(item.getNodeName() + item.getTextContent() + "-----");
			
			
		}
		
	}
}

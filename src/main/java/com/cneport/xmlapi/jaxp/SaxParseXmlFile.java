package com.cneport.xmlapi.jaxp;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParseXmlFile {


	public static void main(String[] args) throws Exception {
		SAXParserFactory saxparseFactory = SAXParserFactory.newInstance();
		SAXParser sAXParser = saxparseFactory.newSAXParser();
		sAXParser.parse(new File("./resource/person.xml"), new MySaxHandler());
		
	}

}

class MySaxHandler extends DefaultHandler {
	/**
	 * 解析到元素的内容时触发
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("content:" + new String(ch, start, length));

	}
	/**
	 * 解析到元素的结束标签时触发
	 */
   @Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("endElement : uri : " + uri + ",localName : " + localName + ",qName : " + qName);
	}
   
   /**
    * 解析到元素的起始标签时触发
    */
   @Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("startElement : uri : " + uri + ",localName : " + localName + ",qName : " + qName);

	}
}
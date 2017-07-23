package com.ydf.common.utils.module.mapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class XmlMapper
{

	@SuppressWarnings("unchecked")
	public static Map<String,String> Xml2Map4lbs(Document document) {
		
		Element root = document.getRootElement();
		List <Element>attrs = root.elements();
		Map<String,String>map = new HashMap<String,String>();
		for (Iterator<Element> it = attrs.iterator(); it.hasNext();) {
			Element e =  it.next();
			String propertyName = e.attributeValue("property");
			String propertyValue = e.attributeValue("value");
			map.put(propertyName, propertyValue);
		}
		return map;
    }
	
	@SuppressWarnings("unchecked")
	public static Map<String,String> Xml2Map4lbs(String documentText) {
		Document document = null;
		try
		{
			document = DocumentHelper.parseText(documentText);
		}
		catch (DocumentException e1)
		{
			e1.printStackTrace();
			return null;
		}  
		Element root = document.getRootElement();
		List <Element>attrs = root.elements();
		Map<String,String>map = new HashMap<String,String>();
		for (Iterator<Element> it = attrs.iterator(); it.hasNext();) {
			Element e =  it.next();
			String propertyName = e.attributeValue("name");
			String propertyValue = e.attributeValue("value");
			map.put(propertyName, propertyValue);
		}
		return map;
     }


}

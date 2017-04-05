package com.xiao.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class XmlParser {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test() throws IOException, DocumentException {
		List<Map> effectList = new ArrayList<>();
		List<Map> causeList = new ArrayList<>();
		List<Map> idList = new ArrayList<>();
		SAXReader saxReader = new SAXReader();
		org.dom4j.Document document = (Document) saxReader.read(new File("C:/Xml/gene2life-6-544.xml"));
		Element rootElement = document.getRootElement();
		// 默认causalDependencies也是一个list
		List<Element> causalDependencies = rootElement.elements("causalDependencies");
		// 获取used wasDerivedFrom 下对应的effect 和 cause
		for (Element element : causalDependencies) {
			// 遍历used
			List<Element> usedElements = element.elements("used");
			for (Element temp : usedElements) {
				Map<String, String> effectMap = new HashMap<>();
				Map<String, String> causeMap = new HashMap<>();
				Element elemEffect = temp.element("effect");
				Element elemCause = temp.element("cause");
				effectMap.put("effect", elemEffect.attributeValue("ref"));
				effectList.add(effectMap);
				causeMap.put("cause", elemCause.attributeValue("ref"));
				causeList.add(causeMap);
			}
			// 遍历wasDerivedFrom used兄弟节点
			List<Element> wasElements = element.elements("wasDerivedFrom");
			for (Element temp : wasElements) {
				Map<String, String> effectMap = new HashMap<>();
				Map<String, String> causeMap = new HashMap<>();
				Element elemEffect = temp.element("effect");
				Element elemCause = temp.element("cause");
				effectMap.put("effect", elemEffect.attributeValue("ref"));
				effectList.add(effectMap);
				causeMap.put("cause", elemCause.attributeValue("ref"));
				causeList.add(causeMap);
			}
		}
		// 默认processes也是一个list
		List<Element> processes = rootElement.elements("processes");
		for (Element element : processes) {
			List<Element> processList = element.elements("process");
			for (Element temp : processList) {
				Map<String, String> idMap = new HashMap<>();
				idMap.put("id", temp.attributeValue("id"));
				idList.add(idMap);
			}
		}
		for (int i = 0; i < effectList.size(); i++) {
			System.out.println(effectList.get(i));
			System.out.println(causeList.get(i));
		}
		for (int i = 0; i < idList.size(); i++) {
			System.out.println(idList.get(i));
		}
	}

}

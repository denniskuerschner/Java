package com.weatherAPI;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class weatherAPI {

	public static void main(String[] args) throws Exception {
		
		String weatherdata = "https://api.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=c9598413af018e77b5b874244a1c3610";
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		
		Document document = documentBuilder.parse(weatherdata);
		
		NodeList city = document.getElementsByTagName("city");
		
		System.out.println(city.getLength());
		
		Node city = city.item();
		
		

	}

}

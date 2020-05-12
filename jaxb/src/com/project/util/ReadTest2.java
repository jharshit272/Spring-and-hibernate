package com.project.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadTest2 {

	public static void main(String[] args) throws IOException, JAXBException {

		Properties prop = new Properties();
		InputStream stream = null;		

		stream = new FileInputStream("config.properties");
		prop.load(stream);

		String xml = prop.getProperty("database");
	
		
		System.out.println(xml);
		
	}
}

package com.project.util;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadTest {

	public static void main(String[] args) throws IOException, JAXBException {

		File file = new File("file.xml");		
		JAXBContext jaxbContext = JAXBContext.newInstance(Job.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Job job = (Job) jaxbUnmarshaller.unmarshal(file);
		
		System.out.println(job.getName());
		System.out.println(job.getAddress().getHouseNo());
		
	}
}

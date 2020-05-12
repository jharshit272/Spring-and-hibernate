package com.project.util;

import java.io.StringWriter;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CreateTest {


	public static void main(String[] args) throws JAXBException {
		Job job=new Job();
		Address address= new Address();
		address.setCity("Delhi");
		address.setHouseNo(new BigInteger("8"));

		job.setAddress(address);
		job.setCreatedBy("harshit");
		job.setName("Harshit Jain");
		job.setEmail("harshit.jain@qamadeeasy.com");

		// Marshalling 
		JAXBContext jaxbContext = JAXBContext.newInstance(Job.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//	    jaxbMarshaller.marshal(job, System.out);
		StringWriter marshed = new StringWriter();   
		jaxbMarshaller.marshal(job, marshed);

		System.out.println(marshed.toString());
	}
}

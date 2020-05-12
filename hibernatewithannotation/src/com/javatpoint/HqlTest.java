package com.javatpoint;

import java.util.List;

import org.hibernate.*;  
import org.hibernate.cfg.*;  

//Not working here but working in hibernate first having 2 xmls
/*
public class HqlTest {

	public static void main(String[] args) {
		
		Session session=new AnnotationConfiguration()  
				.configure().buildSessionFactory().openSession();  

		Query query=session.createQuery("from emp1000");//here persistent class name is Emp  
		List list=query.list();  
		
		
		System.out.println(list);
	}
}
*/
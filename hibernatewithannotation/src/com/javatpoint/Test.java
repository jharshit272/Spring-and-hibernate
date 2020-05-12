
package com.javatpoint;  

import org.hibernate.*;  
import org.hibernate.cfg.*;  

public class Test {  
	public static void main(String[] args) {  
		Session session=new AnnotationConfiguration()  
				.configure().buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  

		Employee e1=new Employee();  
		e1.setId(1003);  
		e1.setFirstName("ramu");  
		e1.setLastName("jain");  

		Employee e2=new Employee();  
		e2.setId(1004);  
		e2.setFirstName("ritika");  
		e2.setLastName("jaikumar");  

		session.persist(e1);  
		session.persist(e2);  

		t.commit();  
		session.close();  
		System.out.println("successfully saved");  
	}  
}  
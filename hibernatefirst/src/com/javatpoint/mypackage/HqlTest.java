package com.javatpoint.mypackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;  
import org.hibernate.cfg.*;  

public class HqlTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession(); 

		Query query=session.createQuery("from Employee e");//here persistent class name is Emp  
				
		query.setFirstResult(3);  
		query.setMaxResults(4); 
		
		List list=query.list();
		
		Iterator i = list.iterator();
		
		while(i.hasNext()){
			
			Object o=(Object) i.next();
			Employee e = (Employee) o;
			System.out.println("Employee id:"+e.getId());
			System.out.println("Employee name:"+e.getFirstName());
			System.out.println("Employee Last name:"+e.getLastName());
		}
		
		
		System.out.println(list.get(0));
	}
}

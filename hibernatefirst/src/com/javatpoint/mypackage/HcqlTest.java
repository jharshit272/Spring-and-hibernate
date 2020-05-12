package com.javatpoint.mypackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HcqlTest {
 public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession(); 
		
	 Criteria c=session.createCriteria(Employee.class);//passing Class class argument  
	 List list=c.list(); 
	 
	 Iterator i = list.iterator();
		
		while(i.hasNext()){			
			Object o=(Object) i.next();
			Employee e = (Employee) o;
//			System.out.println("Employee id:"+e.getId());
//			System.out.println("Employee name:"+e.getFirstName());
//			System.out.println("Employee Last name:"+e.getLastName());
		}
		
		c.add(Restrictions.gt("id",1001));//salary is the propertyname  
		list=c.list();
		  System.out.println("Checking the greater id......");
		    Iterator<Employee> itr=list.iterator();  
		    while(itr.hasNext()){  
		    	Object o=(Object) itr.next();
				Employee e = (Employee) o;
//				System.out.println("Employee id:"+e.getId());
//				System.out.println("Employee name:"+e.getFirstName());
//				System.out.println("Employee Last name:"+e.getLastName());
		} 
		
		    
		    c=session.createCriteria(Employee.class);  
		    c.addOrder(Order.asc("id"));  
		    list=c.list();  
		    
		    itr=list.iterator();  
		    while(itr.hasNext()){  
		    	Object o=(Object) itr.next();
				Employee e = (Employee) o;
//				System.out.println("Employee id:"+e.getId());
//				System.out.println("Employee name:"+e.getFirstName());
//				System.out.println("Employee Last name:"+e.getLastName());
		} 
		    
		    
		    c=session.createCriteria(Employee.class);  
		    c.setProjection(Projections.property("firstName"));  
		    list=c.list(); 
		    
		    itr=list.iterator();  
		    while(itr.hasNext()){  
		    	Object o=(Object) itr.next();
		    	String e = (String) o;
				System.out.println("Employee id:"+e);
			
}
 }
}

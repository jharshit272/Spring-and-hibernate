package com.javatpoint.mypackage;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;  
import org.hibernate.cfg.*;  

public class HqlUpdateTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession(); 
		
		Transaction tx=session.beginTransaction();  
		

		Query query=session.createQuery("update Employee e set firstName=:n where id=:i");//here persistent class name is Emp  
		query.setParameter("n","Rajul");  
		query.setParameter("i",1002);  
		int status=query.executeUpdate();  
		System.out.println(status);  
		tx.commit();  
		
		query=session.createQuery("delete from Employee e where id=1003");  
		//specifying class name (Emp) not tablename  
		query.executeUpdate();  
		
		query=session.createQuery("from Employee e");//here persistent class name is Emp
		
		List list=query.list();
		
		Iterator i = list.iterator();
		
		while(i.hasNext()){			
			Object o=(Object) i.next();
			Employee e = (Employee) o;
			System.out.println("Employee id:"+e.getId());
			System.out.println("Employee name:"+e.getFirstName());
			System.out.println("Employee Last name:"+e.getLastName());
		}
		
		Query q=session.createQuery("select sum(id) from Employee");  
		 list=q.list();  
		    Iterator<Employee> itr=list.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next());  
		}  
	}
}
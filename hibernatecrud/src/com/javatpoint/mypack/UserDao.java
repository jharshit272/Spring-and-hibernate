package com.javatpoint.mypack;  

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;

public class UserDao {  

	public static int register(User u){  
		int i=0;  
		Session session=new Configuration().  
				configure().buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  
		t.begin();  

		i = (Integer)session.save(u);  
		t.commit();  
		session.close();  

		return i;  
	}  

	public static List display(){  
		int i=0;  
		Session session=new Configuration().  
				configure().buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  
		t.begin();  

		Query query=session.createQuery("from User u");//here persistent class name is Emp  
		return query.list();  
	}

	public static List displayById(String id)
	{
		int i=0;  
		Session session=new Configuration().  
				configure().buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  
		t.begin();  

		Query query=session.createQuery("from User u where id="+id);//here persistent class name is Emp  

		//TODO return the object direclty from the query, explore this
		return query.list();  

	}


	public static int update(User u){
		int i=0;  
		Session session=new Configuration().  
				configure().buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  
		t.begin();  

		String updateString = "update User user set name="+u.getName()+" , email="+u.getEmail()+
				" , password=" +u.getPassword()+" where id="+u.getId();
		System.out.println("update string is: "+updateString);
		//Query query=session.createQuery("update User user set name=:n , email=:e , password=:p where id=:i");
		Query query=session.createQuery("update User user set name=:na , email=:e"+
				" , password=:p where id="+u.getId());
		query.setParameter("na", u.getName());
		query.setParameter("e", u.getEmail());
		query.setParameter("p", u.getPassword());
		//query.setParameter("i", u.getId());  
		int status = query.executeUpdate();  
		System.out.println(status);  
		t.commit();
		return status;
	}


	public static int delete(String id){
		int i=0;  
		Session session=new Configuration().  
				configure().buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  
		t.begin();  

		Query query=session.createQuery("delete from User e where id="+id);  
		//specifying class name (Emp) not tablename  
		int status = query.executeUpdate();  
		System.out.println(status);  
		t.commit();
		return status;
	}
}
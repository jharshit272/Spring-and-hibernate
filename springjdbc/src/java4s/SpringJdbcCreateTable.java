package java4s;
 
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
 
public class SpringJdbcCreateTable
{
	JdbcTemplate jt;
 
	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}
 
	public void createTable()
	{
		jt.execute("create table sptest(sno number(3), sname varchar(10))");
		// execute() returns void
		System.out.println("table created");
	}
	
	public void insertRow()
	{
		int k = jt.update("insert into sptest values(107,'US')");
		System.out.println(k+ " row(s) inserted");
	}
	
	public void loadAll()
	{
		List l = jt.queryForList("select * from sptest");
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o.toString());
		}
		
	}
}
<%-- 
    Document   : update
    Created on : Aug 2, 2016, 10:12:04 PM
    Author     : User
--%>

	<%@page import="com.javatpoint.mypack.UserDao"%>
	<%@page import="java.util.Iterator"%>
	<%@page import="java.util.List"%>
	<%@page import="com.javatpoint.mypack.User"%>
	
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        
       String id = request.getParameter("id"); 
       List list=  UserDao.displayById(id);
       Iterator<User> itr = list.iterator();
     
       out.print("<form action='update2.jsp'>");
          String name,sal;
            while (itr.hasNext()) {           
                	Object o = (Object) itr.next();
        			User e = (User) o;
                    out.print("<input type='text' name=id value=" + e.getId() + "><br/><br/>");
                    out.print("<input type='text' name=name value=" + e.getName() + "><br/><br/>");
                    out.print("<input type='text' name=email value=" + e.getEmail() + "><br/><br/>");
                    out.print("<input type='text' name=password value=" + e.getPassword() + "><br/><br/>");
            
                    name = e.getName(); 
                    sal = e.getEmail();
            }
            
            out.print("<input type='submit' value='Update & Save'");
            out.print("</form>");
        
        %>
    </body>
</html>
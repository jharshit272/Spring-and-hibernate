<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@page import="com.javatpoint.mypack.UserDao"%>
	<%@page import="java.util.Iterator"%>
	<%@page import="java.util.List"%>
	<%@page import="com.javatpoint.mypack.User"%>

	<%	List list = UserDao.display();
		Iterator<User> itr = list.iterator();

		out.print("<table width=50% border=1>");
		out.print("<caption>Result:</caption>");
		out.print("<tr>");
		String arra [] = new String[]{"id", "name", "email", "password", "Update", "Delete"};
		//TODO update this
		for (int j = 0; j <= 3; j++) {
			out.println("<th>" + arra[j] + "</th>");
		}
		
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			User e = (User) o;
		
			out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getEmail()
			+ "</td><td>" + e.getPassword()
			+ "</td><td><a href=update.jsp?id=" + e.getId() + ">edit</a></td>"
			+ "</td><td><a href=delete.jsp?id=" + e.getId() + ">Delete</a></td>");
		}
		out.print("</table>");
	%>

</body>
</html>
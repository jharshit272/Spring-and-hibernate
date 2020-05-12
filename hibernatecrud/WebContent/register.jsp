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
	<jsp:useBean id="obj" class="com.javatpoint.mypack.User">
	</jsp:useBean>
	<jsp:setProperty property="*" name="obj" />

	<%  
int i = UserDao.register(obj);  
if(i>0)  
out.println("You are successfully registered");

out.println("Redirecting the displaying all results page in 5 seconds...");
Thread.sleep(5000);
RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
rd.forward(request, response);
  
%>

</body>
</html>
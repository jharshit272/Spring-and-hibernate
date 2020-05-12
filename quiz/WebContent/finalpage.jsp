<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getParameter("option").equals("correct")){
out.print("Correct");
session.setAttribute("score", (Integer)session.getAttribute("score")+1);
}
else{
	out.print("Sorry wrong answer");
}
%>
<h2>Thanks for playing </h2>
<br/>

<h4>Your Total score out of 5 is: </h4> <h3> <%=session.getAttribute("score")%> </h3>
</body>
</html>
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
//System.out.println("request is "+request.getParameter("option"));
if(request.getParameter("option")==null){
	out.print("You ran out of the time");
}
else if(request.getParameter("option").equals("correct")){
out.print("Answer is Correct");
session.setAttribute("score", (Integer)session.getAttribute("score")+1);
}
else{
	out.print("Sorry wrong answer");
}

int questionNumber= (Integer)session.getAttribute("questionNumber")+1;
session.setAttribute("questionNumber", questionNumber);
if((Integer)session.getAttribute("questionNumber")==6){
	request.getRequestDispatcher("finalpage.jsp").forward(request, response);
}

%>

<br/><br/>
<%-- <h4>Your score is <%=session.getAttribute("score")%> </h4> --%>
<br/><br/>



<a href="question<%=session.getAttribute("questionNumber")%>.jsp">click for next question</a>
</body>
</html>
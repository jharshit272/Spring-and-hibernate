<%-- 
    Document   : loginprocess
    Created on : Sep 11, 2016, 7:56:10 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="bean.LoginDao"%>
        <jsp:useBean id="obj" class="bean.LoginBean"/>
        <jsp:setProperty  property="*" name="obj"/>
        
        <%  
boolean status=LoginDao.validate(obj);  
        out.println("validated");  
if(status){  
out.println("You are successfully logged in");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, email or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  
    </body>
</html>

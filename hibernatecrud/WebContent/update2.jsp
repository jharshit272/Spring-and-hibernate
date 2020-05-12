<%-- 
    Document   : update2
    Created on : Aug 2, 2016, 10:36:34 PM
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
        <%@page import="com.javatpoint.mypack.UserDao"%>
      <jsp:useBean id="obj1" class="com.javatpoint.mypack.User">
	</jsp:useBean>
	<jsp:setProperty property="*" name="obj1" />
        
        <% int status = UserDao.update(obj1); 
        if (status > 0) {
                out.print("successfully updated");
                RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
                rd.forward(request, response);
            } else {
                out.print("Update cant be done right now");
            }
        
           %>
    </body>
</html>

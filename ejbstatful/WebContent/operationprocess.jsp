<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.javatpoint.*" %>  
<%  
BankRemote remote=(BankRemote)session.getAttribute("remote");  
String operation=request.getParameter("operation");  
String amount=request.getParameter("amount");  
  
if(operation!=null){  
      
    if(operation.equals("deposit")){  
        remote.deposit(Integer.parseInt(amount));  
        out.print("Amount successfully deposited!");  
    }else  
        if(operation.equals("withdraw")){  
            boolean status=remote.withdraw(Integer.parseInt(amount));  
            if(status){  
                out.print("Amount successfully withdrawn!");  
            }else{  
                out.println("Enter less amount");  
            }  
        }else{  
            out.println("Current Amount: "+remote.getBalance());  
        }  
}  
%>  
<hr/>  
<jsp:include page="operation.jsp"></jsp:include>  

</body>
</html>
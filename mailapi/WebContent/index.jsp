<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="mail.jsp" method="post">
		Enter email: <input type="text" name="email"><br /> <input
			type="submit" value="get OTP" />
	</form>

	<%
		if (!session.equals(null)){
			System.out.println(session.getAttribute("otp"));
			if (session.getAttribute("otp")!=null) {
				out.print("otp sent !! Plz verify !!");
			}
		}
	%>
<br/>
	<form action="success.jsp" method="post">
		Enter otp: <input type="text" name="otp"> <input type="submit"
			value="submit" />
	</form>


</body>
</html>
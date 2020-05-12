<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>

<%
String to= request.getParameter("email"); 

int i=12345;
i++;

//Get the session object  
Properties props = new Properties();  
props.put("mail.smtp.host", "smtp.gmail.com");  
props.put("mail.smtp.socketFactory.port", "465");  
props.put("mail.smtp.socketFactory.class",  
          "javax.net.ssl.SSLSocketFactory");  
props.put("mail.smtp.auth", "true");  
props.put("mail.smtp.port", "465");  
 
Session session1 = Session.getDefaultInstance(props,  
 new javax.mail.Authenticator() {  
 protected PasswordAuthentication getPasswordAuthentication() {  
 return new PasswordAuthentication("coolharsh2007@gmail.com","pulkit");//change accordingly  
 }  
});  
 
//compose message  
try {  
 MimeMessage message = new MimeMessage(session1);  
 message.setFrom(new InternetAddress("coolharsh2007@gmail.com"));//change accordingly  
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
 message.setSubject("Hello");  
 
 session.setAttribute("otp", i);
 message.setText(String.valueOf(i++));  
   
 //send message  
 Transport.send(message);  
 System.out.println("message sent successfully");  
 
} catch (MessagingException e) {throw new RuntimeException(e);}  
 
%>

<jsp:forward page="index.jsp" />  

</body>
</html>
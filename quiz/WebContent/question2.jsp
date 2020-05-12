<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h4>Entomology is the science that studies</h4>

<p align="right">Timer !!!</p>
<p align="right" id = "timer_div"> Time start now</p>

<form action="verify.jsp" method="post">
  <input type="radio" name="option" value="a" >A.	Behavior of human beings<br/>
  <input type="radio" name="option" value="correct">B.	Insects<br/>
  <input type="radio" name="option" value="wrong">C.	The origin and history of technical and scientific terms<br/>
  <input type="radio" name="option" value="d">D.	The formation of rocks<br/>
  
   <input id="submitId" type="submit" value="Submit">
  
</form>



<script>
var seconds_left = 10;
var interval = setInterval(function() {
    document.getElementById('timer_div').innerHTML = --seconds_left;
    
    if (seconds_left <= 0)
    { document.getElementById("submitId").click();
        clearInterval(interval);
    }
}, 1000);

</script>

</body>
</html>
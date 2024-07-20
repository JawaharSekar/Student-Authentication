 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
<div class="hero">
<form class="form-box" action="registerForm" method="post">
<div class="button-box">
<div id="btnn"></div>
<button  type="button" class="btn" >Register</button>
<button type="button" class="btn"><a href="Login.jsp">login</a></button>
</div>
<div class="social-icons">
<img  src="ff.png">
<img src="tw.png">
<img src="gg.png">
</div>
<div class="input-grup">
Username : <input type ="text" class="input-field" name="uname"><br> 
Email : <input type ="text"  class="input-field" name="email"><br>
Password : <input type ="password"  class="input-field" name="pass"><br><br> 
<button type="button" class="submit-btn"><input class="input" type ="submit" value ="Register"></button>
</div>


</form>

</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div class="hero">
<form  class="form-box" action ="login" method ="post">
<div class="social-icons">
<img  src="ff.png">
<img src="tw.png">
<img src="gg.png">
</div>
<div class="input-grup">
<div class="login-setup">
<h1>LOGIN</h1><br><br>
</div>

Email :<input type= "text" name = "email" class="input-field"><br>
Password : <input type ="password" name="pass" class="input-field"><br><br><br>

<input   class="submit-btn" type="Submit" value="login">
</div>
</form>
</div>
</body>
</html>
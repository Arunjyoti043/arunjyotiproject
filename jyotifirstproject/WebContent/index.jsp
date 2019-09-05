<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${error}
<font color="blue">Enter username and password</font>
	<form action="LoginController" method="post">
		UserName: <input type="text" name="username" /> <br />
		Password :<input type="password" name="password" /><br /> 
		<input type="submit" value="login">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Please log in.
	<br />
	<form action="process" method="post">
		<input type="text" name="username" /> <input type="password" name="passwd" />
		<input type="submit" value="Login" />

	</form>
	<c:if test="${param.flag}">
		<div style="color:red"> Invalid Username/Password </div>
	</c:if>
</body>
</html>
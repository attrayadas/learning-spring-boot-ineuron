<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output Page</title>
</head>
<body>
	<center>
		<h1 style='color: red; text-align: center;'>Displaying Simple
			values</h1>
		<h1>name is :: ${name}</h1>
		<h1>age is :: ${age}</h1>
		<h1>address is :: ${address}</h1>
		<hr>
		<h1 style='color: red; text-align: center;'>Displaying Array
			values</h1>
		<b>CountryNames</b><br/>
		<c:forEach var="country" items="${countryNames}">
			${country}<br/>
		</c:forEach>
		<hr/>
	</center>
</body>
</html>

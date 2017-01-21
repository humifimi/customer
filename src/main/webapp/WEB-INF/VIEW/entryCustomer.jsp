<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='<c:url value="/resources/css/style.css" />' rel="stylesheet"
	type="text/css">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="customer" method="post">
		<form:errors path="*" element="div" />
			
			UserName:
			<form:input path="username" />
		<p><form:errors path="username" /></p>
		<br />
			
			Address:
			<form:input path="address" />
		<br />
			
			Birthdate:
			<form:input path="birthdate" type="date" />
		<p><form:errors path="birthdate" /></p>
		<br />
			
			Password:
			<form:input path="password" type="password" />
		<p>
			<form:errors path="password" />
		</p>
		<br />
			
			Sex:
			<form:radiobutton path="sex" value="female" />Female
			<form:radiobutton path="sex" value="male" />Male
			<p>
			<form:errors path="sex" />
		</p>
		<br />

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
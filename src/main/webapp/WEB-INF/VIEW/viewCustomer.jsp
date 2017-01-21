<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Customer Form Entry Result</h1>
<p>User Name :  ${customer.getUsername()}</p>
<p>Address :  ${customer.getAddress()}</p>
<p>Birth Date :  ${customer.getBirthdate()}</p>
<p>Password :  ${customer.getPassword()}</p>
<p>Sex :  ${customer.getSex()}</p>
</body>
</html>
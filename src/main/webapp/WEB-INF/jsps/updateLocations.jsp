<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update Customer</title>
</head>
<body>
<form action="updateLoc" method="POST">
    <pre>
        Id: <input type="text" name="id" value="${costumer.id}" readonly/>
        Firstname: <input type="text" name="firstName" value="${costumer.firstName}"/>
        Lastname: <input type="text" name="lastName" value="${costumer.lastName}"/>
        <input type="submit" value="save"/>
    </pre>
</form>
</body>
</html>
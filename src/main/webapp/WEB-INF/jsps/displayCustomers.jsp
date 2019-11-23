<%@ page import="java.sql.*" %>
<%@ page import="java.sql.DriverManager" %>
<%@page language="java" contentType="text/html; chatset=UTF-8" pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%--
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/customers?serverTimezone=UTC" , "root","sml12345");
    Statement statement = connection.createStatement();
    String query = "SELECT customers.customer.customer_id, customers.customer.firstname, customers.customer.lastname, customers.address.street, " +
            "customers.address.number, customers.address.plz, customers.address.city, customers.contact.businessname, customers.contact.value, customers.contact.type, customers.contact.sort, customers.contact.fk_customer, customers.address.fk_customer " +
            "FROM customers.customer LEFT JOIN customers.address ON customers.address.fk_customer = customers.customer.customer_id LEFT JOIN customers.contact ON customers.contact.fk_customer = customers.customer.customer_id";

    ResultSet resultSet = statement.executeQuery(query);
--%>

<%
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/customers?serverTimezone=UTC" , "root","123456");
    Statement statement = connection.createStatement();
    String query = "SELECT customers.customer.id, customers.customer.firstname, customers.customer.lastname, customers.address.street, " +
            "customers.address.number, customers.address.plz, customers.address.city, customers.contact.businessname, customers.contact.value, customers.contact.type, customers.contact.sort, customers.contact.fk_customer, customers.address.fk_customer " +
            "FROM customers.customer LEFT JOIN customers.address ON customers.address.fk_customer = customers.customer.id LEFT JOIN customers.contact ON customers.contact.fk_customer = customers.customer.id";

    ResultSet resultSet = statement.executeQuery(query);
%>
<h2>Customer:</h2>
<table BORDER="2">
    <tr>
        <th>id</th>
        <th>firstname</th>
        <th>lastname</th>
        <th>idaddress</th>
        <th>address</th>
        <th>number</th>
        <th>city</th>
        <th>plz</th>
        <th>sort</th>
        <th>value</th>
        <th>type</th>
    </tr>
    <% while (resultSet.next()){%>
    <TR>
        <% long id = resultSet.getLong(1);%>
        <% long idcontact = resultSet.getLong(12);%>
        <% long idaddress = resultSet.getLong(13);%>
        <TD> <%= resultSet.getLong(1)%> </TD>
        <TD> <%= resultSet.getString(2)%> </TD>
        <TD> <%= resultSet.getString(3)%> </TD>
        <TD> <%= resultSet.getString(4)%> </TD>
        <TD> <%= resultSet.getString(5)%> </TD>
        <TD> <%= resultSet.getString(6)%> </TD>
        <TD> <%= resultSet.getString(7)%> </TD>
        <TD> <%= resultSet.getString(8)%> </TD>
        <TD> <%= resultSet.getString(9)%> </TD>
        <TD> <%= resultSet.getString(10)%> </TD>
        <TD> <%= resultSet.getString(11) %></TD>
        <td>  <a href="showUpdate?id=<%=idaddress%>">Update</a></td>
        <td>  <a href="deleteCustomer?id=<%=id%>">Delete</a></td>


    </TR>
    <%}%>
</table>
<a href="showCreate">Add Location</a>
</body>
</html>
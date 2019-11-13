<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Customer</title>
</head>
<body>
<form action="saveLoc" method="POST">
    <pre>
        Fistname: <input type="text" name="firstName"/>
        Lastname: <input type="text" name="lastName"/>
        Street: <input type="text" name="street"/>
        Number: <input type="text" name="number"/>
        PLZ: <input type="text" name="plz"/>
        City: <input type="text" name="city"/>
        Businessname: <input type="text" name="businessname"/>
        Value: <input type="text" name="value"/>
         Type: <select name="sort">
              <option value="privatePhone">privatePhone</option>
              <option value="businessPhone">businessPhone</option>
              <option value="mobile">mobile</option>
              <option value="fax">fax</option>
              <option value="email">email</option>
          </select>
          Sort:  <select name="type">
              <option value="PRIVATE">PRIVATE</option>
              <option value="BUSINESS">BUSINESS</option>
          </select>
        <input type="submit" value="save"/>
    </pre>
</form>
${msg}

<a href="displayCustomers">View All</a>
</body>
</html>
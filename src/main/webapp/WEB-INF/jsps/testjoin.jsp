<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>

<HTML>
<HEAD>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <TITLE>Joining Tables</TITLE>
</HEAD>

<BODY>
<H1>Customers</H1>

<%
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/kundenverwaltung?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "sml12345");

    Statement statement = connection.createStatement();
    String query = "SELECT kundenverwaltung.costumer.id, kundenverwaltung.costumer.firstName, kundenverwaltung.costumer.lastName, kundenverwaltung.address.street, kundenverwaltung.address.number, kundenverwaltung.address.plz, kundenverwaltung.address.city,kundenverwaltung.contact.businessname,kundenverwaltung.contact.value, kundenverwaltung.contact.type, kundenverwaltung.contact.sort, kundenverwaltung.contact.idcontact, kundenverwaltung.address.idaddress " +
            "FROM kundenverwaltung.costumer LEFT JOIN kundenverwaltung.address ON kundenverwaltung.address.fkcostumer = kundenverwaltung.costumer.id LEFT JOIN kundenverwaltung.contact ON kundenverwaltung.contact.fkCostumer = kundenverwaltung.costumer.id ";


    ResultSet resultset =
            statement.executeQuery(query) ;

%>

<TABLE BORDER="1">
    <TR>
        <TH>ID</TH>
        <TH>First Name</TH>
        <TH>Last Name</TH>
        <TH>Street</TH>
        <TH>Number</TH>
        <TH>PLZ</TH>
        <TH>City</TH>
        <TH>Business Name</TH>
        <TH>Value</TH>
        <TH>Type</TH>
        <TH>Sort</TH>
    </TR>
    <% while(resultset.next()){ %>
    <TR>
        <% long id = resultset.getLong(1); %>

        <TD> <%= resultset.getLong(1)%></TD>
        <TD> <%= resultset.getString(2) %></TD>
        <TD> <%= resultset.getString(3) %></TD>
        <TD> <%= resultset.getString(4) %></TD>
        <TD> <%= resultset.getString(5) %></TD>
        <TD> <%= resultset.getString(6) %></TD>
        <TD> <%= resultset.getString(7) %></TD>
        <TD> <%= resultset.getString(8) %></TD>
        <TD> <%= resultset.getString(9) %></TD>
        <TD> <%= resultset.getString(10) %></TD>
        <TD> <%= resultset.getString(11) %></TD>
        <TD><a href="showUpdate?id=<%=id%>">update</a></TD>
        <TD><a href="deleteLocations?id=<%=id%>">delete</a></TD>
    </TR>
    <% } %>
</TABLE>


<a href="showCreate">Add Customer</a>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</BODY>
</HTML>
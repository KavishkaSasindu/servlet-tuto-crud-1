<%@ page import="db.DbConnection" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="add" method="post">
    Username : <br>
    <input type="text" name="username" id="username"> <br>
    Email : <br>
    <input type="email" name="email" id="email"> <br>
    <button type="submit">AddUser</button>
</form>
</body>
</html>
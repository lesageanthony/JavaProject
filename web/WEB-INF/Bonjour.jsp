<%--
  Created by IntelliJ IDEA.
  User: onyrick
  Date: 22/05/18
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Bonjour</title>
</head>
<body>
<p>
<h2>Inscription</h2>
<form action="subscribe" method="post">
    <p>
        <label for="login">Login : </label>
        <input type="text" id="login" name="login">
    </p>
    <p>
        <label for="email">Email : </label>
        <input type="email" id="email" name="email">
    </p>
    <p>
        <label for="password">Password : </label>
        <input type="password" id="password" name="password">
    </p>
    <label for="type">Type : </label>

    <select id="type">
        <option value="particulier" selected>Particulier</option>
        <option value="entreprise">Entreprise</option>
        <option value="association">Association</option>
    </select>

    <input type="submit">
</form>

</body>
</html>
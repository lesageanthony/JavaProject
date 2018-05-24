<%--
  Created by IntelliJ IDEA.
  User: onyrick
  Date: 22/05/18
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>

    <jsp:attribute name="header">
        <h2>Inscription</h2>
    </jsp:attribute>

    <jsp:body>
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
    </jsp:body>

</t:layout>
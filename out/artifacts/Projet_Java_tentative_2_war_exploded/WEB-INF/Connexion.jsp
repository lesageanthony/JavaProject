<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:layout>

    <jsp:attribute name="header">
      <h1>Welcome</h1>
    </jsp:attribute>

    <jsp:body>

        <p>${ !empty message ? message : '' }</p>

        <p>
        <h2>Connexion</h2>

        <form action="connexion" method="post">
            <p>
                <label for="login">Login : </label>
                <input type="text" id="login" name="login">
            </p>
            <p>
                <label for="password">Password : </label>
                <input type="password" id="password" name="password">
            </p>

            <input type="submit">
        </form>
    </jsp:body>

    <jsp:attribute name="footer">
      <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p>
    </jsp:attribute>
</t:layout>
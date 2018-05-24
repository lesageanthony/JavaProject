<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
<body>
    <%@include file="header.jsp"%>
    <main class="container-fluid">
        <div class="row">
            <jsp:doBody/>
        </div>
    </main>
    <%@include file="footer.jsp"%>
    <!-- <jsp:invoke fragment="footer"/> -->
</body>
</html>
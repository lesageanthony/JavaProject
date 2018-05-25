<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
<body>
    <%@include file="header.jsp"%>
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <jsp:invoke fragment="header"/>
            </div>
        </div>
    </div>
    <main class="container-fluid">
        <div class="row">
            <jsp:doBody/>
        </div>
    </main>
    <%@include file="footer.jsp"%>
    <!-- <jsp:invoke fragment="footer"/> -->
</body>
</html>
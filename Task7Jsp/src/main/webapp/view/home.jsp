<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.time.LocalDateTime"  %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
    <p1>Asalam Magaleikum !!!! "</p1>

<br/>
    <%
        response.getWriter().write("Welcome !!!!");
    %>

<%=LocalDateTime.now()%>
</body>
</html>

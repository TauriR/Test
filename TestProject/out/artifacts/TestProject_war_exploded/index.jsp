<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: truut
  Date: 16/12/2019
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web Application</title>
  </head>
  <body>
  <h1>Hello world</h1>
  <p> testing just for lols</p>

  <% Date date = new Date();
  out.print("<h2>" +date.toString()+"</h2>");
  %>

  </body>
</html>

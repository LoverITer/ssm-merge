<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h3>${success}</h3>
<h5>服务器时间：<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())%></h5>
</body>
</html>

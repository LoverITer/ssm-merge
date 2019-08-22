<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>图书ISBN编号</th>
        <th>书名</th>
        <th>价格</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${books}" var="book" varStatus="i">
        <tr>
            <td>${book.isbn}</td>
            <td>${book.bookName}</td>
            <td>${book.price}</td>
            <td><button><a href="delete?isbn=${book.isbn}">删除</a></button><button><a href="toUpdatePage?isbn=${book.isbn}">修改</a></button><td>
        </tr>
    </c:forEach>
</table>
${msg}<br/>
<button><a href="toAdd">添加图书</a></button>
</body>
</html>

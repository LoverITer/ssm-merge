<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改图书</title>
</head>
<body>
<form action="save" method="post">
    ISBN： ${book.isbn}<br/><input type="hidden" name="isbn" value="${book.isbn}"/>
    书名：<input type="text" name="bookName" value="${book.bookName}"/><br/>
    价格：<select name="price" ><br/>
    <c:forEach begin="10" end="100" var="price" step="1">
        <option id="option">${price}</option>
        元
    </c:forEach>
</select>
    <button type="submit">保存</button>
</form>
</body>

</html>

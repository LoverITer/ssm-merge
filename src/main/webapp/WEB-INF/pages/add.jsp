<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<form action="save" method="post">
    ISBN： <input type="text" name="isbn"/><br/>
    书名：<input type="text" name="bookName"/><br/>
    价格：<select name="price">
    <c:forEach begin="10" end="100" var="price" step="1">
        <option >${price}</option>元
    </c:forEach>
     </select>
    <button type="submit">保存</button>
</form>
</body>
</html>

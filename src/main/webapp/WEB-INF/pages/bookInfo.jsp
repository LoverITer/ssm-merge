<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息</title>
</head>
<body>

<center>
<button ><a href="toAdd">添加图书</a></button>
<table border="1px" cellspacing="0" cellpadding="0" align="center" width="50%">
    <tr>
        <th>图书ISBN编号</th>
        <th>书名</th>
        <th>价格</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${info.list}" var="book" varStatus="i">
        <tr>
            <td>${book.isbn}</td>
            <td>${book.bookName}</td>
            <td>${book.price}</td>
            <td><button><a href="delete?isbn=${book.isbn}">删除</a></button><button><a href="toUpdatePage?isbn=${book.isbn}">修改</a></button></td>
        </tr>
    </c:forEach>
    <tr style="align: center">
        <td colspan="4" >
            <button><a href="showAll?pageNo=1">首页</a></button>
            <button><a href="showAll?pageNo=${info.getPrePage()}">上一页</a></button>
            <span>
                <c:forEach items="${info.navigatepageNums}" var="nav">
                    <c:if test="${nav==info.pageNum}">
                        <span style="background-color: greenyellow;border-radius: 5px;width: 30px">&nbsp;&nbsp;${nav}&nbsp;&nbsp;</span>
                    </c:if>
                    <c:if test="${nav!=info.pageNum}">
                        <a style="text-decoration: none" color="black" href="showAll?pageNo=${nav}">${nav}</a>
                    </c:if>
                </c:forEach>
            </span>
            <button><a href="showAll?pageNo=${info.getNextPage()}">下一页</a></button>
            <button><a href="showAll?pageNo=${info.getPages()}">末页</a></button>
         </td>
    </tr>
</table>
<span>${msg}<br/></span>
</center>

</body>
</html>

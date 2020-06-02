<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/2/2020
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,tr,td{
            border: 1px solid black;
        }
        table{
            text-align: center;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>name</td>
        <td>age</td>
        <td>address</td>
    </tr>
    <c:forEach items="${list}" var="customer" >
    <tr>
        <td><c:out value="${customer.getName()}"/></td>
        <td><c:out value="${customer.getAge()}"/></td>
        <td><c:out value="${customer.getAddress()}"/></td>

    </tr>
    </c:forEach>
</table>
</body>
</html>

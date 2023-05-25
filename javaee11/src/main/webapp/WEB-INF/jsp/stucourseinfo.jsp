<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/5/25
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选课信息</title>
</head>
<body>
<center>选课信息</center>
<table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>课程列表</td>
    </tr>
    <tr>
        <td>${stucourse.sno}</td>
        <td>${stucourse.sname}</td>
        <td>
            <c:forEach items="${stucourse.courseList}" var="cname">
                ${cname}<br/>
            </c:forEach>
        </td>
</table>
</body>
</html>


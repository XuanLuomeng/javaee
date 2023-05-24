<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/5/25
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>课程信息</title>
</head>
<body>
<%--课程号：${cno}<br/>--%>
<%--课程名：${cname}<br/>--%>
<%--学时数：${period}<br/>--%>
<%--教材名：${bname}<br/>--%>
<%--出版社：${pub}<br/>--%>
<%--价&nbsp;&nbsp;格：${price}<br/>--%>
<%--课程号：${course.cno}<br/>--%>
<%--课程名：${course.cname}<br/>--%>
<%--学时数：${course.period}<br/>--%>
<%--教材名：${course.bname}<br/>--%>
<%--出版社：${course.pub}<br/>--%>
<%--价&nbsp;&nbsp;格：${course.price}<br/>--%>
课程号：${course.cno}<br/>
课程名：${course.cname}<br/>
学时数：${course.period}<br/>
教材名：${course.book.bname}<br/>
出版社：${course.book.pub}<br/>
价&nbsp;&nbsp;格：${course.book.price}<br/>

</body>
</html>

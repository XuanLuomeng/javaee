<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/5/25
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生信息</title>
</head>
<body>
<%--含学号、姓名、年龄、籍贯、身高和体重、身份证号码等--%>
<%--学号：${no}<br/>--%>
<%--姓名：${name}<br/>--%>
<%--年龄：${age}<br/>--%>
<%--籍贯：${snative}<br/>--%>
<%--身高：${height}<br/>--%>
<%--体重：${weight}<br/>--%>
<%--身份证号码：${id}<br/>--%>
学号：${student.no}<br/>
姓名：${student.name}<br/>
年龄：${student.age}<br/>
籍贯：${student.snative}<br/>
身高：${student.height}<br/>
体重：${student.weight}<br/>
身份证号码：${student.idCard.id}<br/>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/5/10
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>课程信息</title>
</head>
<body>
<p>课程编号：${course.cno}</p>
<p>课程名称：${course.cname}</p>
<p>学时数：${course.period}</p>
<p>教材名称：${course.book.bname}</p>
<p>出版社：${course.book.pub}</p>
<p>价格：${course.book.price}</p>
</body>
</html>
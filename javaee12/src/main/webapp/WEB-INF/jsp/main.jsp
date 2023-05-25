<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/5/25
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
</head>
<body>
<c:if test="${sessionScope.username!=null}">
    <p>当前用户：${sessionScope.username}</p>
    <p><a href="tologout">注销</a></p>
    <p><a href="${pageContext.request.contextPath}/index.jsp">返回首页</a></p>
</c:if>
<p>欢迎进入系统管理端</p>
</body>
</html>
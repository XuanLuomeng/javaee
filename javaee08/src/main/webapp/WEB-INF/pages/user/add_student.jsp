<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/4/26
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--学号id、姓名name、性别sex、年龄age、籍贯native及电话tel--%>
<form id="form1" name="form1" method="post" action="addStudent">
    <table width="344" height="95" border="0" cellpadding="0" cellspacing="1"
           style="background-color: #3A8ECD; color: #000000;">
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" style="color: #FFF">添加学生</td>
        </tr>
        <tr>
            <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">学号：</td>
            <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input type="text" name="id"/></td>
        </tr>
        <tr>
            <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">姓名：</td>
            <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input type="text" name="name"/></td>
        </tr>
        <tr>
            <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">性别：</td>
            <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input type="text" name="sex"/></td>
        </tr>
        <tr>
            <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">年龄：</td>
            <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input type="text" name="age"/></td>
        </tr>
        <tr>
            <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">籍贯：</td>
            <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input type="text" name="native"/></td>
        </tr>
        <tr>
            <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">电话号码：</td>
            <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                <input type="text" name="tel"/></td>
        </tr>
        <tr>
            <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">
                <input type="submit" name="button" id="button" value="提交"/>&nbsp;&nbsp;
                <input type="reset" name="button2" id="button2" value="重置"/></td>
        </tr>
    </table>
</form>
</body>
</html>

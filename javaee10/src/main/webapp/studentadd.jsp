<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2023/5/25
  Time: 0:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加课程信息</title>
</head>
<body>
<center>
    <%--含学号、姓名、年龄、籍贯、身高和体重、身份证号码等--%>
    <form id="form1" name="form1" method="post" action="studentadd">
        <table width="500" height="95" border="0" cellpadding="0" cellspacing="1" style="background-color: #3A8ECD; color: #000;">
            <tr>
                <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">学生信息</td>
            </tr>
            <tr>
                <td width="114" height="30" align="right" valign="middle" bgcolor="#FFFFFF">学号：</td>
                <td width="227" height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="no" type="text" size="10" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">姓名：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="name" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">年龄：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="age" type="text" value="0" size="10" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">籍贯：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="snative" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">身高：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input type="text" name="height" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">体重：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="weight" type="text" value="0" size="10" /></td>
            </tr>
            <tr>
                <td height="30" align="right" valign="middle" bgcolor="#FFFFFF">身份证号码：</td>
                <td height="20" align="left" valign="middle" bgcolor="#FFFFFF">
                    <input name="idCard.id" type="text" size="10" /></td>
            </tr>
            <tr>
                <td height="30" colspan="2" align="center" valign="middle" bgcolor="#FFFFFF">
                    <input type="submit" name="button" id="button" value="提交" />&nbsp;&nbsp;
                    <input type="reset" name="button2" id="button2" value="重置" /></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>

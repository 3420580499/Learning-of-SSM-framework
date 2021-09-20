<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2021/5/3
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <font style="color: red;font-size: 25px">你输入的用户名和密码不正确,请重新输入</font>
    <form action="login.do" method="get">
        <table border="2px">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="passWord"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"/></td>
                <td><input type="reset" value="重置" /></td>
            </tr>

        </table>
    </form>
</center>
</body>
</html>

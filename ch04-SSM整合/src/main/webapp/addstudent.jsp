<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2021/4/21
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
</head>
<body>
 <center>
     <form action="add.do" method="get">
         <table>
             <tr>
                 <td>学生编号</td>
                 <td><input type="text" name="id"></td>
             </tr>
             <tr>
                 <td>学生姓名</td>
                 <td><input type="text" name="name"></td>
             </tr>
             <tr>
                 <td>学生邮箱</td>
                 <td><input type="text" name="email"></td>
             </tr>
             <tr>
                 <td>学生年龄</td>
                 <td><input type="text" name="a ge"></td>
             </tr>
             <tr>
                 <td></td>
                 <td><input type="submit" value="注册"></td>
             </tr>
         </table>
     </form>
 </center>
</body>
</html>

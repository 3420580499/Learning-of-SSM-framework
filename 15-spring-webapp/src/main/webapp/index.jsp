<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <center>
      <form action="reg" method="post">
          <table border="2px">
              <tr>
                  <td>学生编号</td>
                  <td><input type="text" name="id"/></td>
              </tr>
              <tr>
                  <td>学生姓名</td>
                  <td><input type="text" name="name"/></td>
              </tr>
              <tr>
                  <td>学生邮件地址</td>
                  <td><input type="text" name="email"/></td>
              </tr>
              <tr>
                  <td>学生年龄</td>
                  <td><input type="text" name="age"/></td>
              </tr>
              <tr>
                  <td><input type="submit" value="注册"/></td>
              </tr>
          </table>
      </form>
  </center>
</body>
</html>
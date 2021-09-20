<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2021/4/11
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>

<%--将其放在WEB-INf目录下用户就不能直接访问了--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   ${requestScope.msg}
   姓名:${requestScope.name}
   年龄:${age}
</body>
</html>

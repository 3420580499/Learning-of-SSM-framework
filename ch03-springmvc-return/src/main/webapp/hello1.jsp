<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2021/4/24
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${requestScope.msg}
${requestScope.fun}--%>
${param.myname}
${param.myage}
<%--这里不能使用下面的方式:因为重定向有两个请求对象--%>
<%--${requestScope.msg}
${requestScope.fun}--%>
</body>
</html>
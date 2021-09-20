<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%--<a  href="other.do">点击访问中央调度器</a>--%>
   <center>
       <%--此处不要写/other.do--%>
       <form action="other.do" method="post">
           <table border="2px">
               <tr>
                   <td>姓名</td>
                   <td><input type="text" name="name"></td>
               </tr>
               <tr>
                   <td>年龄</td>
                   <td><input type="text" name="age"></td>
               </tr>
               <tr>
                   <td><input type="submit" ></td>
                   <td></td>
               </tr>
           </table>
       </form>
   </center>
</body>
</html>

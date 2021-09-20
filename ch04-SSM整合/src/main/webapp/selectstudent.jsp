<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2021/4/21
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
    <script type="text/javascript" src="jquery/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#one").click(function(){
                $.ajax({
                    url:"find.do",
                    type:"post",
                    dataType:"json",
                    success:function (res) {
                        $("#info").html("")
                        $.each(res,function(i,n){
                            /*$("#info").append("<tr>")
                                .append("<td>").append(n.id).append("</td>")
                                .append("<td>").append(n.name).append("</td>")
                                .append("<td>").append(n.email).append("</td>")
                                .append("<td>").append(n.age).append("</td>")
                                .append("</tr>");*/
                            /*使用一下方式就不会早成表的结构混乱了*/
                            /*原因是因为append函数要求必须是闭合的完整的标签，不能先输出一个tr，再输出几个td最后关闭tr。*/
                            //此处在标签中使用n添加个双引号就行,不能使用$ {}方式
                            var content = "<tr>"+"<td>"+n.id+"</td>"+"<td>"+n.name+"</td>"+"<td id="+n.name+">"+n.email+"</td>"+"<td>"+n.age+"</td>"+"</tr>";
                            $("#info").append(content)
                        })
                    }
                })
            })

        })
    </script>

</head>
<body>
  <center>
      <table border="2px">
          <thead >
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>邮箱</td>
                <td>年龄</td>
            </tr>
          </thead>
          <tbody id="info">

          </tbody>
      </table>
      <input type="button" value="学生查询" id="one">
  </center>
</body>
</html>

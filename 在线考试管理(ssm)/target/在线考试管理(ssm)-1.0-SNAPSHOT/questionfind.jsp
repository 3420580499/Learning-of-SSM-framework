<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2021/5/4
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            $.ajax({
                url:"questionfind.do",
                type:"post",
                dataType:"json",
                success:function (res) {
                    $("#info").html("")
                    $.each(res,function(i,n){
                        var content = "<tr>"+"<td>"+n.questionId
                            +"</td>"+"<td>"+n.title
                            +"</td>"+"<td>"+n.optionA
                            +"</td>"+"<td>"+n.optionB
                            +"</td>"+"<td>"+n.optionC
                            +"</td>"+"<td>"+n.optionD
                            +"</td>"+"<td>"+n.answer
                            +"</td>"+"<td>"+"<a href="+"/myweb/questionFindById.do?userId="+n.questionId+">详细信息</a>"
                            +"</td>"+"<td>"+"<a href="+"/myweb/questiondelete.do?userId="+n.questionId+">删除试题</a>"
                            +"</td>"+"</tr>";
                        $("#info").append(content)
                    })
                }
            })
        })
    </script>
</head>
<body>
<center>
    <table border="2px">
        <thead >
        <tr align="center">
            <td>编号</td>
            <td>题目</td>
            <td>选项A</td>
            <td>选项B</td>
            <td>选项C</td>
            <td>选项D</td>
            <td>答案</td>
            <td colspan="2">操作</td>
        </tr>
        </thead>
        <tbody id="info">

        </tbody>
    </table>
</center>
</body>
</html>

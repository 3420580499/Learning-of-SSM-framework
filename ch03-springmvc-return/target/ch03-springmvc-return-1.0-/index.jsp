<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="jQuery/jquery-3.4.1.js"></script>
<script type="text/javascript">
    $(function(){
        $("#four").click(function () {
             $.ajax({
                 url:"obj.do",
                 data:{
                     name:$("#one").val(),
                     age:$("#two").val()
                 },
                 type:"post",
                 dataType:"text",
                 //res从服务器返回的是json格式的字符串{"name":"张三","age":20}
                 //jQuery会把字符串转为json对象,赋值个res形参
                 success:function (res) {
                      //alert(res.name+   +res.age)
                     /*$.each(res,function(i,n){
                         alert(n.name+" "+n.age)
                     })*/
                     alert(123);
                 }
             })
        })
    })
</script>
<body>
   <%--<a  href="other.do">点击访问中央调度器</a>--%>
   <center>
       <%--此处不要写/other.do--%>
       <form action="obj.do" method="post">
           <table border="2px">
               <tr>
                   <td>姓名</td>
                   <td><input type="text" name="name" id="one"></td>
               </tr>
               <tr>
                   <td>年龄</td>
                   <td><input type="text" name="age" id="two"></td>
               </tr>
               <tr>
                   <td><input type="button" id="four" value="发起Ajax请求"></td>
                   <td></td>
               </tr>
           </table>
       </form>
       <input type="button" value="发起Ajax请求" id="three">
   </center>
   <img alt="图片加载失败" src="images/picture 04.png"/>
</body>
</html>

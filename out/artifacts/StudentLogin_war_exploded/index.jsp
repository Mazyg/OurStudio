<%--
  Created by IntelliJ IDEA.
  User: 江西师范大学
  Date: 2019/9/23
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登陆页面</title>
    <style type="text/css">
      h1{text-align:left;}
      h4{text-align:left;color:red;}
      a{text-decoration:none;font-size:20px;color:black;}
      a:hover
      {text-decoration:underline;font-size:24px;color:red;}</style>
  </head>
<body onload="chose()">
<form action="/StudentLogin_war_exploded/loginServlet" method="post">
  <h1>用户登陆页面</h1>
  <hr/>
  <table align="left">
    <tr>
      <td>账号：</td>
      <td><input type="text" name="name" id="name"></td></tr>
    <tr>
      <td>密码：</td>
      <td><input type="password" name="password" id="password"></td>
    </tr>
    <tr>
      <td colspan="1">
      </td>
      <td>
        <input type="submit"  value="登陆"/>
        <input type="reset" value="重置"/>
      </td>
    </tr>
  </table>
</form>
</body>
</html>
<script type="text/javascript">
  function chose () {
    <%
   String result=(String) request.getAttribute("login");
   if(result!=null&&result.equals("1")){
   %>
    alert("登录失败，请重新登录")
    <%
    }
    %>
  }
</script>


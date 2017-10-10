<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
 <form method="POST" name="frmLogin" action="TestController.html">
   <h1 align="center">用户登录</h1><br />
   <center>
    <table border=1>
     <tr>
      <td>用户名：</td>
      <td>
       <input type="text" name="username" value="张三" size="20" maxlength="20" onfocus="if (this.value=='Your name')  this.value='';" />
      </td>
     </tr>
     <tr>
      <td>密&nbsp;&nbsp;码：</td>
      <td>
       <input type="text" name="password" value="" size="20" maxlength="20" onfocus="if (this.value=='Your password')  this.value='';" />
      </td>
     </tr>
     <tr>
      <td>
       <input type="submit" name="Submit" value="提交" />
      </td>
      <td>
       <input type="reset" name="Reset" value="重置" />
      </td>
     </tr>
    </table>
   </center>
  </form>
</body>
</html>
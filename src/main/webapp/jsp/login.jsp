<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form{
	 border: 2px groove black;
	 width : 400px;
	 padding: 20px;
	 display: flex;
	 flex-direction: column;
	 margin: 100px auto;
}
input,button{
     margin-top: 20px ;
     height: 30px;
     
}

</style>
</head>
<body>
<h2 align="center">******Welcome To Institute Management System*******</h2>

<h3><span style="color:red">${message}</span></h3>

<form action="log">
<pre>
UserName : <input type="text" name="username" placeholder="username"><br>
Password : <input type="text" name="password" placeholder="password"><br>

<button>LOGIN</button>

</pre>

</form>
</body>
</html>
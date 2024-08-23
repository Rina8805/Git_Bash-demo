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
<form action="updates">

<pre>
<input type="hidden" name="studentId" value="${stu.studentId}"><br>
Student Name : <input type="text" name="studentName" value="${stu.studentName}"><br>

Student Age : <input type="text" name="age" value="${stu.age}"><br>
Student Address : <input type="text" name="address" value="${stu.address}"><br>
<input type="submit" value="Update">
</pre>
</form>

</body>
</html>
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
<form action="saves">

<pre>
Student Name : <input type="text" name="studentName"><br>
Education Details : <input type="text" name="educationDetails"><br>
Student Age : <input type="text" name="age"><br>
Student Address : <input type="text" name="address"><br>
<input type="submit" value="Submit">
</pre>
</form>

</body>
</html>
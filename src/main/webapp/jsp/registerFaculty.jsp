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
<form action="savef">

<pre>
Faculty Name : <input type="text" name="facultyName"><br>
Faculty Occupation : <input type="text" name="occupation"><br>
Faculty Salary : <input type="text" name="salary"><br>
Faculty Contact No. : <input type="text" name="contactNumber"><br>
<input type="submit" value="Submit">
</pre>

</form>
</body>
</html>
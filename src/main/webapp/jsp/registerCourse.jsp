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

<form action="savec">
<pre>
Course Name : <input type="text" name="courseName"><br><br>
Course Type : <input type="text" name="courseType"><br><br>
Course Fees : <input type="text" name="fees"><br><br>
Course Modes : <input type="text" name="modes"><br><br>
<input type="submit" value="Submit">
</pre>

</form>
</body>
</html>
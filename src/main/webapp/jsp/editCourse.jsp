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

<form action="update">
<pre>
<input type="hidden" name="courseId" value="${co.courseId}"><br>
Course Name : <input type="text" name="courseName" value="${co.courseName}"><br><br>
Course Type : <input type="text" name="courseType" value="${co.courseType}"><br><br>
Course Fees : <input type="text" name="fees" value="${co.fees}"><br><br>
Course Modes : <input type="text" name="modes" value="${co.modes}"><br><br>
<input type="submit" value="Update">
</pre>

</form>
</body>
</html>
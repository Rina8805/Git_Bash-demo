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
<form action="updatef">

<pre>
<input type="hidden" name="courseId" value="${fa.facultyId}"><br>
Faculty Name : <input type="text" name="facultyName" value="${fa.facultyName}"><br>
Faculty Occupation : <input type="text" name="occupation" value="${fa.occupation}"><br>
Faculty Salary : <input type="text" name="salary" value="${fa.salary}"><br>
Faculty Contact No. : <input type="text" name="contactNumber" value="${fa.contactNumber}"><br>
<input type="submit" value="Update">
</pre>

</form>
</body>
</html>
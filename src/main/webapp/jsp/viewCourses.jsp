<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<thead>
<tr>
<th>COURSE ID</th>
<th>COURSE NAME</th>
<th>COURSE TYPE</th>
<th>COURSE FEES</th>
<th>COURSE MODES</th>
<th>ACTION</th>
</tr>
</thead>


<c:forEach items="${data}" var="c">
<tr>
<td><input type="radio" name="courseId" value="${c.courseId}">${c.courseId}</td>
<td>${c.courseName}</td>
<td>${c.courseType}</td>
<td>${c.fees}</td>
<td>${c.modes}</td>
<td><a href="delete?courseId=${c.courseId}">DELETE</a>||<a href="edit?courseId=${c.courseId}">EDIT</a></td>
</tr>
</c:forEach>

</table>



</body>
</html>
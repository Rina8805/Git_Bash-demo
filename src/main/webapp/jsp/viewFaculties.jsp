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
<tr>
<th>FACULTY ID</th>
<th>FACULTY NAME</th>
<th>OCCUPATION</th>
<th>SALARY</th>
<th>CONTACT NUMBER</th>
<th>ACTION</th>
</tr>

<c:forEach items="${data}" var="f">
<tr>
<td>${f.facultyId}</td>
<td>${f.facultyName}</td>
<td>${f.occupation}</td>
<td>${f.salary}</td>
<td>${f.contactNumber}</td>
<td><a href="deletef?facultyId=${f.facultyId}">DELETE</a>||<a href="editf?facultyId=${f.facultyId}">EDIT</a></td>
</tr>
</c:forEach>

</body>
</html>
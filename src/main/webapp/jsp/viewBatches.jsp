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
<th>BATCH NUMBER</th>
<th>BATCH NAME</th>
<th>STUDENT COUNT</th>
<th>BATCH TIME</th>

</tr>

<c:forEach items="${data}" var="b">
<tr>
<td>${b.batchNumber}</td>
<td>${b.batchName}</td>
<td>${b.studentCount}</td>
<td>${b.batchTime}</td>


</tr>
</c:forEach>

</body>
</html>
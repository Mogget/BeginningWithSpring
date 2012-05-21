<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>All Person</title>
</head>
<body>
<h1>List Articles</h1>
<a href="articles/add.html">Add Article</a>

<c:if test="${!empty persons}">
	<table>
		<tr>
			<th>Article ID</th>
			<th>Article Name</th>
			<th>Article Desc</th>
			<th>Added Date</th>
		</tr>

		<c:forEach items="${persons}" var="person">
			<tr>
				<td><c:out value="${person.userId}"/></td>
				<td><c:out value="${person.firstname}"/></td>
				<td><c:out value="${person.lastname}"/></td>
				<td><c:out value="${person.email}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
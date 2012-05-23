<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<h1>List Person</h1>

<c:if test="${!empty persons}">
	<table id="personTable">
		<thead>
			<tr>
				<th>Person ID</th>
				<th>Person First Name</th>
				<th>Person Last Name</th>
				<th>Person Email</th>
				<th>Person Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${persons}" var="person">
				<tr>
					<td><c:out value="${person.userId}" /></td>
					<td><c:out value="${person.firstname}" /></td>
					<td><c:out value="${person.lastname}" /></td>
					<td><c:out value="${person.email}" /></td>
					<td><c:out value="${person.date}" /></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<th>Person_ID</th>
				<th>Person_First_Name</th>
				<th>Person_Last_Name</th>
				<th>Person_Email</th>
				<th>Person_Date</th>
			</tr>
		</tfoot>
	</table>
</c:if>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<div>
<b>Towarzyszu</b>
Sprawdź czy znajdujesz się na liście dzielnych wojowników walczących za ojczyznę.
</div>

<c:if test="${!empty persons}">
	<div id="demo">
		<table cellpadding="0" cellspacing="0" border="0" class="display"
			id="personTable" width="100%">
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
					<th>Person ID</th>
					<th>Person First Name</th>
					<th>Person Last Name</th>
					<th>Person Email</th>
					<th>Person Date</th>
				</tr>
			</tfoot>
		</table>
	</div>
</c:if>

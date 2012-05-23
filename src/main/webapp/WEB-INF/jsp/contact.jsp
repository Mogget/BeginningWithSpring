<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div>
<b>Już czas!</b><br />
Czas zdecydować czy będziesz stał biernie z boku czy też przyłączysz się do walki o ojczyznę.<br \>
Pamiętaj jednak, że życie żołnieża jest ciężkie i niebezpieczne.
Jeżeli zdecydujesz się na walkę dopisz się do listę.
</div>
<div>
<form:form method="post" action="contacts.html" commandName="userData">

	<table>
	<tr>
		<td><form:label path="firstname">First Name: </form:label></td>
		<td><form:input path="firstname" /></td> 
		<td><form:errors path="firstname" /></td>
	</tr>
	<tr>
		<td><form:label path="lastname">Last Name: </form:label></td>
		<td><form:input path="lastname" /></td>
		<td><form:errors path="lastname" /></td>
	</tr>
	<tr>
		<td><form:label path="email">Email: </form:label></td>
		<td><form:input path="email" /></td>
		<td><form:errors path="email" /></td>
	</tr>
	<tr>
		<td><form:label path="date">Birth Date: </form:label></td>
		<td><form:input path="date" id="inputDate"/></td>
		<td><form:errors path="date" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Add Contact"/>
		</td>
	</tr>
</table>	
	
</form:form>
</div>
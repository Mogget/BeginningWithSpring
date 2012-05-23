<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:useAttribute id="list" name="cssFilesList" classname="java.util.List" />
<c:forEach var="cssFileName" items="${list}"> 
	@import "<%=request.getContextPath()%><c:out value="${cssFileName}" />";
</c:forEach>
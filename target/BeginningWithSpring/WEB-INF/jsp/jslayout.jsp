<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:useAttribute id="list" name="jsfilesList" classname="java.util.List" />
<c:forEach var="jsfileName" items="${list}">
    <script type="text/javascript" language="javascript" src="<%=request.getContextPath()%><c:out value="${jsfileName}" />"></script>
</c:forEach>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$('#personTable').dataTable();
	});
</script>
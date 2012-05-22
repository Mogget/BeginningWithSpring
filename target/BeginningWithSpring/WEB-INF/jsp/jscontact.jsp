<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!--
<tiles:useAttribute id="list" name="jsfilesList"
	classname="java.util.List" />
<c:forEach var="jsfileName" items="${list}">
	<script type="text/javascript" language="javascript"
		src="<%=request.getContextPath()%><c:out value="${jsfileName}" />"></script>
</c:forEach>
-->
<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$("#inputDate").datepicker(
				{ changeMonth: true, 
					changeYear: true, 
					defaultDate: -18, 
					hideIfNoPrevNext: true, 
					maxDate: "-18y", 
					minDate: "-118y", 
					navigationAsDateFormat: true, 
					yearRange: "-58:-18",
					showButtonPanel: true,
					dateFormat: "dd/mm/yy",
					appendText: "(dd/mm/yyyy)",
					altFormat: "dd/mm/yy"}	
		);

	});
</script>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<style type="text/css" title="currentStyle">
	<tiles:insertAttribute name="cssList" ignore="true" />	
	@import "<%=request.getContextPath()%><tiles:getAsString name='cssDefault' />";
	@import "<%=request.getContextPath()%><tiles:getAsString name='css' ignore='true'/>";
</style>
<tiles:insertAttribute name="jsfile" ignore="true" />
</head>
<body>
	<div id="top">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="menu">
			<tiles:insertAttribute name="menu" />
		</div>
		<div id="body">
			<tiles:insertAttribute name="body" />
		</div>

		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>
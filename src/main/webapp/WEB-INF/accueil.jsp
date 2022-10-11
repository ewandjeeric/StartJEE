
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/./css/bootstrap.css"/>">
</head>
<body>
	<%@ include file="menu.jsp"%>
	<h1>
		<c:out value="BIENVENU SUR MON SITE"></c:out>
		${empty nom ? "": nom }

		<c:set var="internaut" value="HERO" scope="application" />
		<!-- 
		    String nom = (String) request.getAttribute("nom"); 
		    if (nom != null)
		    out.print(nom););
		%> -->

	</h1>
	<p>${ noms[0] }</p>

	<c:choose>
		<c:when test="${ nom == internaut }"> Admin</c:when>
		<c:when test="${ nom == 'Bruno' }">User</c:when>
		<c:otherwise>Hello internaut</c:otherwise>
	</c:choose>
   <div class="col-2">
	<c:forEach items="${noms}" var="name" varStatus="status">
		<ul class="list-group">
			<li
				class="list-group-item d-flex justify-content-between align-items-center">
				No <c:out value="${status.count}"></c:out> 
				<c:out value="${name}"></c:out>
			</li>
		</ul>
	</c:forEach>
	</div>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>


<link type="text/css" rel="stylesheet" href="<c:url value="/./css/bootstrap.css"/>" />

</head>
<body>

<c:import url="menu.jsp"></c:import>
<h2>Hello Hello Hello</h2>
<h1>
<% 
String message = (String) request.getAttribute("var");
out.println(message);
%>
</h1>
<p>
<b>Nom : </b> ${ personne.nom }<br>
Utulisateur : <c:out value="${ internaut }"></c:out>
</p>

<c:forEach var="i" begin="0" end="6" step="2">
<p>Message <c:out value="${ i }"/></p>
</c:forEach>
<button class="btn btn-primary">test</button>
</body>
</html>
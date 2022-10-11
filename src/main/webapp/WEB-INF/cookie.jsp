<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/./css/bootstrap.css"/>">
</head>
<body>
	<c:import url="menu.jsp"></c:import>
	<div class="container">
		<div class="row">
			<div class="col-6">
				<div class="card text-white bg-dark">
					<div class="card-header">Cookie</div>
					<div class="card-body">
						<h4 class="card-title">
							<c:if test="${ !empty cookienom && !empty cookieprenom }">
							${cookienom} ${cookieprenom}
							</c:if>
						</h4>
						<form method="post" action="cookie">
							<div class="form-group">

								<label for="description">nom</label> <input type="text"
									name="nom" class="form-control" id="nom"
									placeholder="">
							</div>

							<div class="form-group">
								<label for="prenom">Prenom</label> <input type="text"
									name="prenom" class="form-control" id="Prenom"
									placeholder="">
							</div>


							<button type="submit" class="btn btn-secondary mb-2">Envoyer</button>


						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
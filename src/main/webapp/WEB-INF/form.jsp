<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/./css/bootstrap.css"/>">
</head>
<body>
<c:import url="menu.jsp"></c:import>
<div class="container">
<div class="row">
<div class="col-6">
<div class="card text-white bg-dark">
  <div class="card-header">Header</div>
  <div class="card-body">
    <h4 class="card-title"><c:out value="${ empty name? '': name }"></c:out></h4>
    <form method="post" action="form" enctype="multipart/form-data">
  <div class="form-group">
    
      <label  for="description">Description</label>
      <input type="text" name="description" class="form-control" id="description" placeholder="">
    
    <div class="form-group">
      <label for="exampleInputFile">File input</label>
      <input type="file" class="form-control-file" name="fichier" id="exampleInputFile" aria-describedby="fileHelp">
      <small id="fileHelp" class="form-text text-muted"></small>
    </div>
   
    
      <button type="submit" class="btn btn-secondary mb-2">Envoyer</button>
    
  </div>
</form>
  </div>
</div>
</div>
</div>
</div>
</body>
</html>
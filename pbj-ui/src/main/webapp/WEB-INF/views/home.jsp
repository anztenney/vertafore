<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.15/angular-route.min.js"></script>
		
		<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.13.0/ui-bootstrap.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.13.0/ui-bootstrap-tpls.min.js"></script>
		<script src="app/js/app.js"></script>
    	<script src="app/js/controllers.js"></script>
		
	
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
		<link rel="stylesheet" href="app/styles/pbj.css">
		
		<title>PBJ</title>
	</head>
	
	<body>
		<div class="pageHeader">
			<h2>PBJ</h2>
			<h2>
				${message} ${name}
			</h2>
		</div>
	
		<div id="body" ng-app="pbjModule">
	        <section class="content-wrapper main-content clear-fix" ng-view>
	            @RenderBody()
	        </section>
	    </div>
	</body>
</html>
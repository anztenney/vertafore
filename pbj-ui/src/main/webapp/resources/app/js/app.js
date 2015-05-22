var pbjModule = angular.module("pbjModule", [ 'ngRoute', 'demoControllers' ]);

pbjModule.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/hello', {//C:/dev/vertafore/pbj-ui/src/main/webapp/WEB-INF
		templateUrl : '/pbj-ui/app/views/Hello.html',
		controller : 'HelloController'
	}).when('/goodbye/:userId', {
		// userId - variable from URL
		templateUrl : '/pbj-ui/app/views/Goodbye.html',
		controller : 'GoodbyeController'
	}).otherwise({
		redirectTo : '/hello'
	});
} ]);
angular.module('pbjModule', [ 'ngRoute', 'demoControllers' ]).config(function($routeProvider, $httpProvider) {

	$routeProvider.when('/', {
		templateUrl : 'home.html',
		controller : 'home'
	}).when('/login', {
		templateUrl : 'login.html',
		controller : 'HelloController'
	}).otherwise('/');

	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

}).controller('home', function($scope, $http) {
	$http.get('/resource/').success(function(data) {
		$scope.greeting = data;
	})
});
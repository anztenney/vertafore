var demoControllers = angular.module("demoControllers", []);

demoControllers.controller("HelloController", [
		"$rootScope",
		"$scope",
		"$http",
		"$location",
		function($rootScope, $scope, $http, $location) {
//			$scope.pageHeading = 'this is page title. - hello';
//			$http.get('home?name=BJ').success(function(data) {
//				$scope.greeting = data;
//			})

			var authenticate = function(credentials, callback) {

				var headers = credentials ? {
					authorization : "Basic "
							+ btoa(credentials.username + ":"
									+ credentials.password)
				} : {};

				$http.get('user', {headers : headers}).success(function(data) {
					if (data.name) {
						$rootScope.authenticated = true;
					} else {
						$rootScope.authenticated = false;
					}
					callback && callback();
				}).error(function() {
					$rootScope.authenticated = false;
					callback && callback();
				});

			}

			authenticate();
			$scope.credentials = {};
			$scope.login = function() {
				authenticate($scope.credentials, function() {
					if ($rootScope.authenticated) {
						$location.path("/");
						$scope.error = false;
					} else {
						$location.path("/login");
						$scope.error = true;
					}
				});
			};

			$scope.logout = function() {
				$http.post('logout', {}).success(function() {
					$rootScope.authenticated = false;
					$location.path("/");
				}).error(function(data) {
					console.log("Logout failed")
					$rootScope.authenticated = false;
				});
			}
		} ]);

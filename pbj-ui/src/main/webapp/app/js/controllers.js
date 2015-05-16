var demoControllers = angular.module("demoControllers", []);

demoControllers.controller("HelloController", ["$scope", "$http", function ($scope, $http) {
    $scope.pageHeading = 'this is page title. - hello';
    
}]);

demoControllers.controller("GoodbyeController", ["$scope", "$http", function ($scope, $http) {
    $scope.pageHeading = 'this is page title. - goodbye';
    
}]);
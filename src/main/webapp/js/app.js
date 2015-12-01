'use strict';

// Declare app level module which depends on filters, and services
angular.module('camlin', ['camlin.filters', 'camlin.services', 'camlin.directives', 'camlin.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'MyCtrl1'});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);

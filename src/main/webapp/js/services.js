'use strict';

/* Services */

var services = angular.module('camlin.services', ['ngResource']);

services.factory('UserFactory', function ($resource) {
    return $resource('/camlin/rest/users', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});

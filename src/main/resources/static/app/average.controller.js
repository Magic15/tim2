(function () {
    'use strict';

    angular
        .module('app')
        .controller('myCtrl', function($scope, $http){

            $scope.number = 5;
            $scope.items = [];
            $scope.getAvg = getAvg;

            function getAvg(numberList)
            {
                var url ="/average/" + numberList;
                $http.get(url).then(function(response){
                    $scope.average = response.data;
                });
            }
            });
})();

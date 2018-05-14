(function () {
    'use strict';

    angular
        .module('app')
        .controller('ListController', ListController);

    ListController.$inject = ['$http'];

    function ListController($http) {
        var vm = this;

        vm.bookings = [];
        vm.items = [];
        vm.getList = getList;

        function getList(myNumber)
        {
            vm.items = [];
            var url ="/list/getList/" + myNumber;
            $http.get(url).then(function(response){
                vm.items = response.data;
            });
        }
    }
})();

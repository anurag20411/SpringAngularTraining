
 angular.module('myApp').factory('userService',['$http', '$q', function($http, $q){
	 
	  // var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/user/';
	   
	   var url="/WebApp/getUsers.do";
	   
	    var factory = {
	        fetchAllUsers: fetchAllUsers,
	        
	    };
	 
	    return factory;
	 
	    function fetchAllUsers() {
	        var deferred = $q.defer();
	        $http.get(url)
	            .then(
	            function (response) {
	                deferred.resolve(response.data);
	            },
	            function(errResponse){
	                console.error('Error while fetching Users');
	                deferred.reject(errResponse);
	            }
	        );
	        return deferred.promise;
	    }
	 
	 
	 
 }])

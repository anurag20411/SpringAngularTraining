
angular.module('myApp').controller('ctrl1',['$scope', 'userService', function($scope, userService){
	$scope.user={id:null,username:'',address:'',email:''};
	$scope.users=[];
	
	
	   
	 
		 console.log("in fetch users")
	        userService.fetchAllUsers()
	            .then(
	            function(d) {
	                $scope.users = d;
	            },
	            function(errResponse){
	                console.error('Error while fetching Users');
	            }
	        );
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}]);


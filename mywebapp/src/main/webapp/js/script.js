$(document).ready(function(){


		$('#employeeForm').validate({
	    rules: {
	      firstName: {
	        required: true,
	       required: true
	      },
	     lastName: {
		        required: true,
		       required: true
		      }
	    
		  
	    },
			highlight: function(element) {
				$(element).closest('.control-group').removeClass('success').addClass('error');
			},
			success: function(element) {
				element
				.text('OK!').addClass('valid')
				.closest('.control-group').removeClass('error').addClass('success');
			}
	  });

}); // end document.ready
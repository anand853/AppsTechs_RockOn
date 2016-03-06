$(document).ready(function(){


		$('#employeeForm').validate({
	    rules: {
	      firstName: {
	        required: true,
	       required: true,
	       minlength: 6
	      },
	     lastName: {
		        required: true,
		       required: true,
		       minlength: 6
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap Form With Spring Mvc Example</title>



<script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery.validate.min.js">
</script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/bootstrap.min.css">         
<style>
label.error {
	font-weight: bold;
	color: red; 
	background: url("error.png") center center no-repeat;
	display: inline-block;
	text-indent: -9999px;
}
label.valid {
	width: 24px;
	height: 24px;
	color: green;
	background: url("valid.png") center center no-repeat;
	display: inline-block;
	text-indent: -9999px;
	}




.controls{padding: 10px;}

.btn {
align:center;
margin-left:100px;
}
</style> 
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<fieldset>
				<legend>Bootstrap Form With Spring Mvc Example</legend>
				 <form class="form-horizontal" method="post" action='employee/add.htm' name="employeeForm" id="employeeForm">
					<div class="control-group">
						<label class="control-label">First Name</label>
						<div class="controls">
							<input type="text" name="firstName" id="firstName" title="First Name" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Last Name</label>
						<div class="controls">
							<input type="text" name="lastName" id="lastName" title="Last Name" value="">
						</div>
					</div>
					
					
					<div class="form-actions">
						<button type="submit" class="btn btn-primary btn-lg">Submit</button>
						
						
											</div>
				</form>
				</fieldset>
			</div>
		</div>
	</div>
	
	
<script src="<%=request.getContextPath() %>/js/jquery-1.7.1.min.js"></script> 
 
<script src="<%=request.getContextPath() %>/js/jquery.validate.js"></script> 
 
<script>
            addEventListener('load', prettyPrint, false);
            $(document).ready(function(){
            $('pre').addClass('prettyprint linenums');
                  });
            </script> 		
            
<script type="text/javascript">
            
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
</script>
</body>
</html>

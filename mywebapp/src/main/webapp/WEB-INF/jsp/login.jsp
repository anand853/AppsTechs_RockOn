<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript"  src="./js/jquery.validate.min.js">
</script>
<script>

if(typeof(Storage)!=="undefined")
	{
localstorage.setItem("accnum",accountnum);

document.getElementById("accountnum").innerHTML=localStorage.getItem("accnum");

	}
else{

	document.getElementById("accountnum").innerHTML="not supported";
	
}



</script>
 <link rel="stylesheet" href="./css/bootstrap.min.css">         
<style>


body {
    background-image: url("./img/nyc.jpg");
}
label.error {
	font-weight: bold;
	color: red; 
	background: url("./img/error.png") center center no-repeat;
	display: inline-block;
	text-indent: -9999px;
}
label.valid {
	width: 24px;
	height: 24px;
	color: green;
	background: url("./img/valid.png") center center no-repeat;
	display: inline-block;
	text-indent: -9999px;
	}

.controls{padding: 10px;}

.btn {
align:center;
margin-left:100px;
}
.container-fluid
{
margin-top:150px;
margin-left:350px;
}

#middle{
margin-left:270px;
margin-top:30px;
}

.form-actions
 {
 
 
 }
 
 
</style> 
    <title>User Login.</title>
    </head>
   
   
   
   
    <body>
    <div class="container-fluid">
   <h2 id="middle">Login Form</h2>
         <div class="row-fluid">
         <div class="span12">
         </div>
         </div>
         <div class="row-fluid">
         <div class="span6 offset6">
         <div id="maincontent" class="span8">
         				<fieldset>
          
         <form method="post" commandName="register" name="myForm"
              id="registration_form" class="form-horizontal" action="">
         <div class="control-group">
         <label class="control-label">Account number:</label>
         <div class="controls">
         <input type="text" class="input-xlarge" name="accountnum" />
         </div>
         </div>
         <div class="control-group">
          <label class="control-label">Pin</label>
         <div class="controls">
         <input type="password" class="input-xlarge" name="pin" />
         </div>
         </div>
         <div class="form-actions">
        <button type="submit" class="btn btn-primary btn-large">
         submit
       </button>
       
      </form>
     <form action="Register.htm" method="get">
      <button type="submit" class="btn btn-primary btn-large">
      Register</button> </form>
             
      
      </div>
      </fieldset>
      
      </div>

      </div>
      </div>
       </div>
       
       <script src="./js/jquery-1.7.1.min.js"></script> 
 
       <script src="./js/jquery.validate.js"></script> 


<script>

addEventListener('load', prettyPrint, false);

$(document).ready(function()
		{

    $('pre').addClass('prettyprint linenums');

     });
     
 </script> 		

 <script type="text/javascript">

     $(document).ready(function(){
     $('#registration_form').validate({

           rules:{
               
    	 
    	           accountnum: {
	                              required: true,
	                              required: true,
	                              minlength: 6
	                          },
	                    pin: {
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

}); 

  </script>
 </body>
 </html>



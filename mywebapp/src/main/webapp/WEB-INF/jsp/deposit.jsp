<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
   String name = request.getParameter( "accountnum" );
   session.setAttribute( "theName", name );
%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery.validate.min.js">
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

#bolo
{

margin-right:100px;

}
#hello
{


margin-right:170px;
}


.container-fluid
{

margin-top:200px;
margin-left:350px;
}

#middle{
margin-left:170px;
margin-top:40px;
}

#iello
{
margin-left:300px;
margin-top:10px;
 }
 
 #hello{
margin-left:300px;
margin-top:30px;
}
 

</style> 
    <title>User Login.</title>
    </head>
   
   
   
   
    <body>
        
        
   <div class="container-fluid">
      <h2 id="middle">Please enter the amount </h2>
   
         <div class="row-fluid">
         <div class="span12">
         </div>
         </div>
         <div class="row-fluid">
         <div class="span6 offset6">
         <div id="maincontent" class="span8">
         				<fieldset>
          
         <form method="post" commandName="deposit" name="depositForm"
              id="deposit_form" class="form-horizontal" action="">
        
         <div class="control-group">
         <!--  <label class="control-label">Account Number</label>
         <div class="controls">
         <input type="text" class="input-xlarge" name="account_number" />
         </div> -->
         
         <label class="control-label">Amount</label>
         <div class="controls">
         <input type="text" class="input-xlarge" name="addmoney" />
         </div>
         
         
         </div>
         
        
        <button type="submit"  id="hello" class="btn btn-primary btn-large">
         submit
       </button>
       
           <button type="submit"  id="iello" class="btn btn-default btn-large" >
                  <a href="login.htm">
                    Logout  
                  </a>
                
          </button>             
        
      </form>
      </fieldset>
      
      </div>

<div style="color:green">${welcome}</div>
<div style="color:green">${error}</div>




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
     $('#deposit_form').validate({

           rules:{
               
    	 
        	   amount: {
	                              required: true,
	                              required: true,
	                              minlength: 3
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



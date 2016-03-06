<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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

.container
{

margin-top:200px;
margin-left:500px;
}


.viva
{

margin-left:50px;
margin-bottom:70px;
font-size:30px;
color:black;
font-family: "Times New Roman", Georgia, Serif;

}


#hello

{

margin-left:100px;

}

#kello
{
margin-left:100px;

}

#lello
{


margin-left:80px;
}
#iello
{


margin-left:100px;
}



</style> 
    <title>User Login.</title>
    </head>
   
   
   
   
    <body>
          
       
     
     
     <div class="container">
     
     
     
     
     
     <p class="viva">Bank of Nerds</p>  
       
         
        
        
        <form action="withdraw.htm" method="get">
        <button type="submit"  id="hello" class="btn btn-primary btn-large">
         withdraw
         </button>
          </form>
       
        <form action="deposit.htm" method="get">
       <button type="submit"  id="kello" class="btn btn-success btn-large">
         deposit
       </button>
       </form>
        
        
        <form action="balance.htm" method="get">
         <button type="submit"  id="lello" class="btn btn-danger btn-large">
          checkbalance
          </button>
          </form>
          
            <form action="login.htm"  method="get">
            <button type="submit"  id="iello" class="btn btn-default btn-large">
          Logout
          </button>       
       </form>
       
      
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



package com.technicalkeeda.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.technicalkeeda.bean.Registermodel;
import com.technicalkeeda.bean.bank;
import com.technicalkeeda.service.User_Service;

@Controller
public class RegisterController {
	

	  
	  private User_Service user_service;
	  
	  	 
	
     
      public User_Service getUser_service() {
		return user_service;
	}


      
      @Autowired(required=true)
      @Qualifier(value="user_service")
	public void setUser_service(User_Service user_service) {
		this.user_service = user_service;
	}

	PreparedStatement ps=null;
      Connection con=null;
     




	 @RequestMapping(value="/Register.htm", method = RequestMethod.GET)
    	    public String RegisterPage(ModelMap modelMap) {
	     System.out.println("Hello");
	     
		 return "Register";
	    }
	 
	@RequestMapping(value="/Register.htm",method = RequestMethod.POST)
	     public String submit(ModelMap modelMap, @ModelAttribute("update") Registermodel registermodel,
			   HttpSession session) throws SQLException {

	   int  accountnum=registermodel.getAccountnum();
	   int pin=registermodel.getPin();
	   int balance=registermodel.getBalance();
	     
         int result=user_service.Registration(accountnum,pin,balance);
	       

	        
	        
	        if(result>0){
	     
	        	System.out.println("result"+result);
	        	         System.out.println("hi");
	        			 modelMap.put("welcome","your are succesful registered");
		        			 return "Register";
		        			 
		        			 
		        			 
		        			 
		        			 
		        			 
		        			 
	        }
	        else
	        	 System.out.println("bye");
	        	modelMap.put("error","please register again");
			    return "Register";

	        
	  
	      }

	
	


	
	

}




/*

Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("lokesh@mail.com");
        emp.setFirstName("lokesh");
        emp.setLastName("gupta");
         
        //Save the employee in database
        session.save(emp);
 
        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();

*/
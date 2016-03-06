package com.technicalkeeda.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.technicalkeeda.bean.Balancemodel;
import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.bank;
import com.technicalkeeda.bean.Withdrawmodel;
import com.technicalkeeda.dao.User_Dao;
import com.technicalkeeda.service.User_Service;


@Controller
//@RequestMapping("login.htm")
@SessionAttributes({"accountnum","pin"})
public class LoginController {
	

	  private User_Service user_service;
	  @Autowired
      private  bank bank;
	  @Autowired
      private DepositController depositcontroller;
	  @Autowired
	  private BalanceController balanceController;
	  
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
     

 
      public bank getbank() {
		return bank;
	}


	public void setbank(bank bank) {
		this.bank = bank;
	}


	 
      
	//value="/method2", method=RequestMethod.POST
	 @RequestMapping(value="/login.htm", method = RequestMethod.GET)
    	    public String init(ModelMap modelMap) {
	     System.out.println("Hello");
	     
		 return "login";
	    }
	 
	@RequestMapping(value="/login.htm",method = RequestMethod.POST)
	     public String submit(ModelMap modelMap, @ModelAttribute("Register")bank bank,
			   HttpSession session) throws SQLException {
	        System.out.println("in submit" + bank);

	    
	        modelMap.put("accountnum", bank.getAccountnum());
	        modelMap.put("pin", bank.getPin());
                    
	      
	      int pin=bank.getPin();
         int temp=user_service.checkLogin(bank.getAccountnum(), pin);
	       

	        
	        
	        if(temp>0){
	     
	        	         System.out.println("hi");
	        			 modelMap.put("welcome","your logged in");
	        			 
	        			 System.out.println("i came here");
	        			 return "Home";
	        }
	        else
	        	 System.out.println("bye");
	        	modelMap.put("error","please login");
			    return "login";

	        
	  
	      }

	
	


}

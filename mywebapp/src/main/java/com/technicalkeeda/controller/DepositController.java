package com.technicalkeeda.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.bank;
import com.technicalkeeda.service.User_Service;

@Controller
public class DepositController{

	@Autowired
	private User_Service user_service;

	

	@RequestMapping(value="/deposit.htm", method = RequestMethod.GET)
    public String deposit(ModelMap modelMap) {
     System.out.println("am in deposit");
     
	 return "deposit";
    }
	
	
	@RequestMapping(value="/deposit.htm", method = RequestMethod.POST)
    public String deposit_submit(HttpSession session,ModelMap modelMap,@ModelAttribute("deposit") 
    Depositmodel depositmodel) throws SQLException {
	
	      
	      int account_num = (Integer)session.getAttribute("accountnum");
	      
		


		 
		 //System.out.println("inside deposit controller"+accountnum);
		 
    	int	amount=user_service.deposit(account_num,depositmodel.getAddmoney());
      
      if(amount>0){
       //	  System.out.println("Kiran acc"+accountnum);
    	  System.out.println("done with deposit");
          modelMap.put("welcome","your money has been deposited");
          return "deposit";
    	  
     }
     else
    	  
    	  modelMap.put("error","please recheck your amount entered");
    	  		return "deposit";
    	  
    	              	    }
	
	
	
	
	
	
	
	
	
	

}

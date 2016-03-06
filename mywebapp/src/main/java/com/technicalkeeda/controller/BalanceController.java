package com.technicalkeeda.controller;
import java.util.*;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.technicalkeeda.bean.Balancemodel;
import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.bank;
import com.technicalkeeda.service.User_Service;


@Controller
public class BalanceController {
	
	@Autowired
private User_Service user_service;
	
	
@RequestMapping(value="/balance.htm",method=RequestMethod.GET)	
public String balancepage(ModelMap modelMap){
	System.out.println("your transaction page is here");
	return "balance";
	
	
}

@RequestMapping(value="/balance.htm",method=RequestMethod.POST)	
public String checkBalance(HttpSession session,ModelMap modelMap) 
{
	int accountnum=(Integer) session.getAttribute("accountnum");
	
	 int pin = (Integer)session.getAttribute("pin");
	 
	int balance=user_service.checkBalance(accountnum);

	
		
		System.out.println(balance+"lets see what you have");
		modelMap.put("welcome",accountnum+","+pin+","+balance);
        return "balance";
  	  
		
	//}
	//userservice obj.checkbalance(accno)
	//return list...
	//modelmap.put();
	
	//
	
	
}


	
	
	
	
}

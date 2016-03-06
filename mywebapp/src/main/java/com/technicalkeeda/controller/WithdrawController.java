package com.technicalkeeda.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.technicalkeeda.bean.Withdrawmodel;
import com.technicalkeeda.service.User_Service;

@Controller
public class WithdrawController {
	
	@Autowired
	private User_Service user_service;
	
	@RequestMapping(value="/withdraw.htm", method=RequestMethod.GET)
	public String withdraw(ModelMap modelMap){
		System.out.println("start ur withdraw");
		return "withdraw";		
		
	}
	
	
	@RequestMapping(value="/withdraw.htm",method=RequestMethod.POST)
	public String withdraw_submit(HttpSession session,ModelMap modelMap,@ModelAttribute("withdraw")
	Withdrawmodel withdrawmodel)throws SQLException

	{
		
		int amount=withdrawmodel.getAmount();
		
		int accountnum=(Integer) session.getAttribute("accountnum");
		
		int withdrawn= user_service.withDraw(accountnum, amount);
		
		if(withdrawn>0){
			System.out.println("Your amount has been withdrawn");
			modelMap.put("welcome","Your amount has been withdrawn");
		   return "withdraw";
		} 
		else 
			modelMap.put("error","please recheck your amount");
			
		 return "withdraw";
		
		
		
		
}
}
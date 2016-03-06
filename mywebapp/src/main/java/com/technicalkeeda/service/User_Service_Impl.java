package com.technicalkeeda.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technicalkeeda.bean.Balancemodel;
import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.bank;
import com.technicalkeeda.dao.User_Dao;


 
@Service("User_Service")
public class User_Service_Impl implements User_Service{

	
	@Autowired
	 private User_Dao user_dao;
	
	public User_Dao getUser_dao() {
		return user_dao;
	}

	public void setUser_dao(User_Dao user_dao) {
		this.user_dao = user_dao;
	}
	
	@Transactional
     public int checkLogin(int accountnum, int pin) {
		// TODO Auto-generated method stub
		return user_dao.checkLogin(accountnum, pin);
	}
	@Transactional
	public int deposit(int accountnum,int amount) {
		
		return user_dao.deposit(accountnum,amount);
		
	}

	public int withDraw(int accountnum, int amount) {
		
	return user_dao.withDraw(accountnum, amount);
		

	}

	public int checkBalance(int accountnum) {
		
		return user_dao.checkBalance(accountnum);
	}
	
	
	  public int Registration(int accountnum,int pin,int balance){
		return user_dao.Registration(accountnum, pin, balance);
		  
	  }
}






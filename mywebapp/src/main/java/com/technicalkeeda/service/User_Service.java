package com.technicalkeeda.service;

import java.util.List;

import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.bank;
import com.technicalkeeda.dao.User_Dao;

	

public interface User_Service{
	
 

    public int checkLogin(int accountnum,int pin);
    public int deposit(int accountnum,int amount);
    public int withDraw(int accountnum,int amount);
    public int checkBalance(int accountnum);
    public int Registration(int accountnum,int pin,int balance);
}

	




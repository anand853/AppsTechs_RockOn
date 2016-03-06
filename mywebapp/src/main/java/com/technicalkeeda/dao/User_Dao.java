package com.technicalkeeda.dao;

import java.util.List;

import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.bank;

public interface User_Dao {
	
    public int checkLogin(int accountnum,int pin);
    public int deposit(int accountnum,int amount);
    public int withDraw(int accountnum,int amount);
    public int checkBalance(int accountnum);
    public int Registration(int accountnum,int pin,int balance);
    
    

}
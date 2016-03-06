package com.technicalkeeda.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name="bank")

public class bank {

	
	

	
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Id
	@Column(name="accountnum")	
	private int accountnum;
	@Column(name="pin")
	private int  pin;
	@Column(name="balance")
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	
	
	  @Override
	    public String toString(){
	        return "accountnum"+accountnum;
	    }
	
}

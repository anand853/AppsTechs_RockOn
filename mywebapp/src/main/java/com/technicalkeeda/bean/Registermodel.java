package com.technicalkeeda.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bank")

public class Registermodel {

	
	//@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_seq")
	//@SequenceGenerator(name="my_seq", sequenceName="seq_app",allocationSize=10)
    //@Column(name = "id", unique = true,nullable=false)
	
	
	

	@Column(name="pin")
	private int pin;
	
	@Id
	@Column(name="accountnum")	
	private int accountnum;

	@Column(name="balance")
	private int balance;
	
	
	
	 @Override
	    public String toString(){
	        return "accountnum"+accountnum;
	    }
	
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

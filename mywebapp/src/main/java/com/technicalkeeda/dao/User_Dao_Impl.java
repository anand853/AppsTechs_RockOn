package com.technicalkeeda.dao;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.technicalkeeda.bean.Depositmodel;
import com.technicalkeeda.bean.Registermodel;
import com.technicalkeeda.bean.bank;



@Repository("User_Dao")
public class User_Dao_Impl implements User_Dao {

	
	
	public static int i=1;
	     private SessionFactory sessionFactory;
	     
	   
	     
	    
	
    	


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public int deposit(int accountnum,int amount){
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("update bank set balance = balance+? where accountnum=? ");
	    query.setParameter(0, amount);
	    query.setParameter(1,accountnum);	  
	    
		int result = query.executeUpdate();
		if(result>0){
			return 1;
		}
		else 
			return 0;
	
		
	}
	


	public int checkLogin(int accountnum,int pin) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		String SQL_QUERY ="from bank o where o.accountnum=? and o.pin=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,accountnum);
		query.setParameter(1,pin);
		List list = query.list();
		if (list.size() > 0)
		{
			return 1;
		}
		else
			
			
			
			//session.getTransaction().commit();  
			session.close();
			return 0;

			
		

	}
     
	public int withDraw(int accountnum,int amount){
		
		Session session=sessionFactory.openSession();
		
		String SQL_QUERY="update bank set balance=balance-? where accountnum=? and balance> ?";
		
		Query query=session.createQuery(SQL_QUERY);
		query.setParameter(0,amount);
		query.setParameter(1, accountnum);
		query.setParameter(2,amount);
		int result=query.executeUpdate();
		if(result>0)
		{
     return 1;
			
		}
		else
		return 0;
		
		
		
	}

	 public int checkBalance(int accountnum){
		 
		 
		 Session session=sessionFactory.openSession();
		 		 String SQL_QUERY="select balance from bank where accountnum=?";
		 Query query=session.createQuery(SQL_QUERY);
		 query.setParameter(0,accountnum);
		 Integer res = (Integer) query.uniqueResult();
		System.out.println(res+"My balance is =");
		 return res;
		  
		 		
		 
		 
		 }


	 public int Registration(int accountnum,int pin,int balance){
		 
		 
		 Session session=sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 String sql = "INSERT INTO bank(accountnum,pin,balance) VALUES(?,?,?)";
		SQLQuery  query = session.createSQLQuery(sql);
		 
	
		 query.setParameter(0, accountnum);
		 query.setParameter(1, pin);
		 query.setParameter(2, balance);
		 session.getTransaction().commit();

		int s= query.executeUpdate();
		if(s>0)
		{
			return 1;
		}
		else
			
		 
		session.flush();
		 return 0;
		 } 
	        
	 }

/*private static void saveProduct(Product product){
24
        Session session = sessionFactory.openSession();
25
        session.beginTransaction();
26
        SQLQuery insertQuery = session.createSQLQuery("" +
27
        "INSERT INTO product(manufactured_date,price,product_code,product_name,vat)VALUES(?,?,?,?,?)");
28
        insertQuery.setParameter(0, product.getManufacturedDate());
29
        insertQuery.setParameter(1, product.getPrice());
30
        insertQuery.setParameter(2, product.getProductCode());
31
        insertQuery.setParameter(3, product.getProductName());
32
        insertQuery.setParameter(4, product.getVat());
33
        insertQuery.executeUpdate();
34
        session.getTransaction().commit();
35
    }
36
 


	
 		/* String SQL_QUERY="insert into bank(accountnum,pin,balance)values(?,?,?)";
		 
 		Query query=session.createSQLQuery(SQL_QUERY);
 		query.setParameter(0,accountnum);
 		 query.setParameter(1,pin);
 		 query.setParameter(2,balance);
 		 int result=query.executeUpdate();
 		 if(result>0)
 		 {
 	       return 1;
 			
    		}
 		else
 	    	return 0;
		      
	 } 
		 /
		  * *
		  */
	//	 Session session=sessionFactory.openSession();
 		// String SQL_QUERY="insert into bank(id,accountnum,pin,balance)values(seq_id,?,?,?)";
 		 
 //Query query=session.createSQLQuery(SQL_QUERY);


	

	


package com.atm.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.atm.model.Loginmodel;


@Controller
@RequestMapping("login.htm")
public class LoginController {

      PreparedStatement ps=null;
      Connection con=null;

      public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Autowired
     private DataSource dataSource;

      
      
	 @RequestMapping(method = RequestMethod.GET)
	    public String init(ModelMap modelMap) {
	     System.out.println("Hello");      
		 return "login";
	    }


	 @RequestMapping(method = RequestMethod.POST)
	    public String submit(ModelMap modelMap,@ModelAttribute("loginmodel") Loginmodel loginmodel) throws SQLException {
	        System.out.println("in submit" + loginmodel);
	        
	        String sql = "select*from  bank where  accountnum=? and password=?";

	        int pin = loginmodel.getPin();
	        String account_num=loginmodel.getAccountnum();
	        System.out.println("pin"+pin);
	        System.out.println("account_num"+account_num);
	        con=dataSource.getConnection();
	        ps =con.prepareStatement(sql);
	        ps.setString(1,account_num);
	        ps.setInt(2, pin);
	        int rowsAffected = ps.executeUpdate();
	        if(rowsAffected>0)
	        {
	            modelMap.put("userInfo", loginmodel.getAccountnum());
	            modelMap.put("welcome", "you are loggedin");
	            
	            return "Home";

	        }

 else {
	            modelMap.put("error", "Invalid UserName / Password");
	            return "login";
	        }
	 
	    }
}

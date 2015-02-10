package edu.xautjzd.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.xautjzd.entity.User;
import edu.xautjzd.service.UserService;

public class Main {
	public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	UserService userService = (UserService)appContext.getBean("userService");
 
    	/** insert **/
    	User user = new User();
    	user.setUserName("姜政冬");
    	user.setAddress("陝西西安");
    	user.setEmail("xautjzd@163.com");
    	user.setPhone("15829709272");
    	userService.save(user);
 
    	/** select **//*
    	Stock stock2 = stockBo.findByStockCode("7668");
    	System.out.println(stock2);
 
    	*//** update **//*
    	stock2.setStockName("HAIO-1");
    	stockBo.update(stock2);
 
    	*//** delete **//*
    	stockBo.delete(stock2);*/
 
    	System.out.println("Done");
    }
}

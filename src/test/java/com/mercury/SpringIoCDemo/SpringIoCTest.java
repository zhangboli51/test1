package com.mercury.SpringIoCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mercury.daos.CarDao;
import com.mercury.daos.RoomDao;
import com.mercury.daos.UserDao;
import com.mercury.services.MarketingService;
import com.mercury.services.TrainingService;

public class SpringIoCTest {

	public static void main(String[] args) {
		ApplicationContext actx = new FileSystemXmlApplicationContext("resources/spring-ioc.config.xml");
		
		System.out.println(">_<");
//		
//		UserDao ud = (UserDao)actx.getBean("ud");
//		UserDao ud2 = (UserDao)actx.getBean("ud");
//		System.out.println(ud);
//		System.out.println(ud2);
//		
//		System.out.println(ud == ud2);
//		System.out.println("...........");
//		
//		RoomDao rd = (RoomDao)actx.getBean("rd");
//		RoomDao rd2 = (RoomDao)actx.getBean("rd2");  //prototype
//		System.out.println(rd);
//		System.out.println(rd2);
//		
//		System.out.println(rd == rd2);
//		System.out.println("............");
//		
//		ApplicationContext actx1 = new FileSystemXmlApplicationContext("resources/spring-ioc.config.xml");
//		UserDao ud1 = (UserDao)actx1.getBean("ud");
//		System.out.println(ud == ud1);
//		System.out.println("......................");
//		System.out.println("MS...........................");
//		// use default constructor to get object 
//		MarketingService ms = (MarketingService)actx.getBean("ms");
//		MarketingService ms2 = (MarketingService)actx.getBean("ms");
//		System.out.println(ms == ms2);
//		System.out.println(ms.getUd());
//		System.out.println(ms.getRd());
//		
//		System.out.println(ms2.getUd());
//		System.out.println(ms2.getRd());
//		
//		// use setter to get class object 
//		System.out.println("ms....property.......");
//		MarketingService ms3 = (MarketingService)actx.getBean("ms2");
//		System.out.println(ms3.getUd());
//		System.out.println(ms3.getRd());
//		System.out.println("^-^");
//		MarketingService ms4 = (MarketingService)actx.getBean("ms2");
//		System.out.println(ms4.getUd());
//		System.out.println(ms4.getRd());
//		
//	
//		
//		
//		
//		
//		System.out.println("......................");
//		
//		TrainingService ts = (TrainingService)actx.getBean("ts");
//		
//		System.out.println(ts);
//		System.out.println("......................");
//		
		CarDao cd = (CarDao)actx.getBean("cd");
		CarDao cd2 = (CarDao)actx.getBean("cd2");
		
		System.out.println(cd);
		System.out.println(cd2);
		System.out.println(cd == cd2);
		
		
	}

}

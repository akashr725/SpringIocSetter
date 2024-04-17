package com.Spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.beans.MassageGenerator;

public class MyApp {

	public static void main(String[] args) {
					
			//bean factory object
					
				ApplicationContext	apctxt=new ClassPathXmlApplicationContext("com/Spring/cfg/MassageGen.xml");
			    MassageGenerator msgn=(MassageGenerator) apctxt.getBean("msgen");
			
			    String msg=msgn.grtMassage("Akash");
			    System.out.println(msg);
					
				
	}

}

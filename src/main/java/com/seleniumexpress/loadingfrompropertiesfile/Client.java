package com.seleniumexpress.loadingfrompropertiesfile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans file loaded");
		
		 College college =  context.getBean("collegeBean",College.class);
//		 college.cheating();
		 System.out.println("college obj is printed by spring " +college);
		
  }
}

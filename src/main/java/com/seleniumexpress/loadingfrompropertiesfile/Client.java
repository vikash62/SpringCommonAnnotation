package com.seleniumexpress.loadingfrompropertiesfile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
 public static void main(String[] args) {
	 ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans file loaded");
		
		 College college =  context.getBean("colBean",College.class);
		 college.test();
		 System.out.println("college obj is printed by spring " +college);
		
  }
}

package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public Principle principleBean() {
		return new Principle();
	}
	@Bean
  public College collegeBean() {  //bean id
	  College college = new College();
	  college.setPrinciple(principleBean());
	  return  college;
  }
}
  
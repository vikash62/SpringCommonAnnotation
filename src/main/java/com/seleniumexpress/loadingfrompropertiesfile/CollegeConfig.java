package com.seleniumexpress.loadingfrompropertiesfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.loadingfrompropertiesfile")
public class CollegeConfig {
	
	@Bean
  public College collegeBean() {  //bean id
	  College college = new College();
	  return  college;
  }
}
  
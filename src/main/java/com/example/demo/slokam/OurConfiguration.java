package com.example.demo.slokam;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.slokam")
public class OurConfiguration {
	
	@Bean
	Manager manager() {
		return new Manager();
	}
	
	@Bean
	TeamLead teamLead() {
		return new TeamLead();
	}
	
	@Bean
	Devloper devloperone() {
		return new Devloper();
	}
	@Bean(name="one")
	String stringone() {
		return "Welcome to java_one";
	}
	@Bean(name="two")
	String stringtwo() {
		return "Welcome to java_two";
	}
	@Bean(name="three")
	ArrayList<String> arrayListOne(){
		ArrayList<String> ar=new ArrayList<>();
		ar.add("satesh");
		ar.add("anil");
		ar.add("harish");
		return ar;
	}
	@Bean(name="four")
	ArrayList<String> arrayListTwo(){
		ArrayList<String> ar=new ArrayList<>();
		ar.add("one");
		ar.add("two");
		ar.add("three");
		return ar;
	}

}

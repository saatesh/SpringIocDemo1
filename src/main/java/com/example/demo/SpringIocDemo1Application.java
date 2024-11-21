package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.slokam.Devloper;
import com.example.demo.slokam.Manager;

@SpringBootApplication
public class SpringIocDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac= SpringApplication.run(SpringIocDemo1Application.class, args);
	    Manager b= ac.getBean(Manager.class);
	    b.doWork();
	    System.out.println("==========-------------================");
	    String string= (String) ac.getBean("one");
	    System.out.println(string);
	    String stringTwo= (String) ac.getBean("two");
	    System.out.println(stringTwo);
	    System.out.println("=======================================");
	    ArrayList<String> names= (ArrayList<String>) ac.getBean("three");
	    System.out.println(names);
	    
	    ArrayList<String> names1= (ArrayList<String>) ac.getBean("four");
	    System.out.println(names1);
	    System.out.println("============");
	    Devloper dev= (Devloper) ac.getBean("devloperone");
	    dev.doWork();
	    System.out.println(dev);
	}

}

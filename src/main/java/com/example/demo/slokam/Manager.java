package com.example.demo.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Manager {

	@Autowired
	private TeamLead tl;
	
	public void doWork() {
		System.out.println("Manager work is started..");
		tl.dowork();
		System.out.println("Manager work is completed..");
	}
}

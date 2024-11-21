package com.example.demo.slokam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component
public class TeamLead {
	
	
	@Autowired
	@Qualifier("devloperone")
	private Devloper dev;
	public void dowork() {
		System.out.println("TeamLead work is started..");
		dev.doWork();
		System.out.println("Teamlead Work is completed..");
	}

}

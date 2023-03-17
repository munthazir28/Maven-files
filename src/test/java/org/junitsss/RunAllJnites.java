package org.junitsss;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class RunAllJnites {
	@Test
public void tc() {
	Result r = JUnitCore.runClasses(Jnite1.class,Jnite2.class,Jnites3.class);
	System.out.println("\n Test Result");
	System.out.println("\n get failed count :"+r.getFailureCount());
	System.out.println("\n get ignore count :"+r.getIgnoreCount());
	System.out.println("\n get passed count :"+r.getRunCount());
	System.out.println("\n get time count :"+r.getRunTime());
	List<Failure> fail = r.getFailures();
	for (Failure fails : fail) {
		System.out.println("\n fails details :"+fails);
		
	}
	

	
	
}
}

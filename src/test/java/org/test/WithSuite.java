package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class WithSuite {
	public static void main(String[] args) {
		Result r=JUnitCore.runClasses(Junit.class,JunitAssert.class);
     int failureCount = r.getFailureCount();
     System.out.println("Failure count"+failureCount);
     int ignoreCount = r.getIgnoreCount();
     System.out.println("Ignore count"+ignoreCount);
     int runCount = r.getRunCount();
     System.out.println("runcount :"+runCount);
     List<Failure> failures = r.getFailures();
     for (Failure failure : failures) {
    	 System.out.println(failure);
		
	}}}


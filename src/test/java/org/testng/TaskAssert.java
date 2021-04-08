package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TaskAssert {
	@Test
	private void tc1() {
       
		SoftAssert s=new SoftAssert();
	      s.assertTrue(false);
	      System.out.println("tc1");
	      System.out.println("tc2");
	       System.out.println("tc3");
	       System.out.println("tc5");
	      s.assertAll();
	       System.out.println("tc4");
	       System.out.println("tc6");
		}


}

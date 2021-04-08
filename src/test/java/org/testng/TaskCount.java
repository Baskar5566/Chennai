package org.testng;

import org.testng.annotations.Test;

public class TaskCount {
	@Test
	private void tc1() {
		System.out.println();
	}
	@Test(invocationCount = 5)
	private void tc2() {

	} 

}

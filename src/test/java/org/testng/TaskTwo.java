package org.testng;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.testng.annotations.Test;

public class TaskTwo {
	@Test(priority = 1,enabled =true)
	private void test1() {

	}
@Test(priority = -7,enabled = false)
	private void test2() {

	}
	@Test(priority = 0)
	private void test3() {

	}
	
	}

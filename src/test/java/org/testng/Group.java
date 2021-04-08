package org.testng;

import org.testng.annotations.Test;

public class Group {
	@Test(groups ="smoke")
   private void test1() {
    System.out.println("test1");
}	@Test(groups ="sanity")
   private void test2() {
    System.out.println("test2");
}	@Test(groups ="smoke")
   private void test3() {
    System.out.println("test3");
}
}

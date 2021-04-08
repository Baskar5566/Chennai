package org.test;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {
	@Ignore
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
}
	@AfterClass                                                                                                                                                      
	public static void afterClass() {
		System.out.println("afterClass");
}
	@After
	public void after() {
		System.out.println("after");
}
	@Before
	public void before() {
		System.out.println("before");
}  @Ignore
	@Test
	public void tc0() {
		System.out.println("test");
}	
@Ignore
@Test
public void tc2() {
System.out.println("test2");}
@Test
public void tc3() {
System.out.println("test3");}
@Test
public void tc1() {
System.out.println("test1");}


	}



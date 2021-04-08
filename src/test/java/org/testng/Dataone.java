package org.testng;

import org.testng.annotations.Test;

public class Dataone {
	@Test(dataProvider ="sample",dataProviderClass =TaskPara.class )
	private void tc22(String email,String pass) {
		System.out.println(email);
        System.out.println(pass);
        System.out.println("done...");
        
	}

}

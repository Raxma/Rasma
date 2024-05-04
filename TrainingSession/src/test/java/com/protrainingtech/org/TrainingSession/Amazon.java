package com.protrainingtech.org.TrainingSession;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.ForgotPassword;
import Pages.Home;
import common.Util;

public class Amazon extends Util{
	
	  @Test (priority=3)
	  public void f() throws InterruptedException, IOException {
			Home ob=new Home(driver);
			ob.emailfill();
			ob.passwordfille();
			Thread.sleep(6000);
			ob.forgottenpassword();
			ForgotPassword fp=new ForgotPassword(driver);
			fp.forgottenfield();
			fp.search();
			shots();
			Thread.sleep(6000);
			SoftAssert assertion=new SoftAssert();
			String forgottext =fp.Google();
			System.out.println(forgottext);
			//Assert.assertEquals(forgottext, "Reset Your Password");
			assertion.assertEquals(forgottext, "Reset Your Password");
			System.out.println("This is after assertion");
			assertion.assertAll();
	  }
	  @Test (priority=4)
	  public void CreateAcc() {
		  Home ob=new Home(driver);
		  ob.newAcc();
	  }
	
}

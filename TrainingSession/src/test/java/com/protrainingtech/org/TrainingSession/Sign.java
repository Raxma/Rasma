package com.protrainingtech.org.TrainingSession;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.ForgotPassword;
import Pages.Home;
import common.Util;
import java.io.IOException;

public class Sign extends Util {
	 
  @Test (priority=1)
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
		assertion.assertEquals(forgottext, "Reset Your Password");
		System.out.println("This is after assertion");
		assertion.assertAll();
  }
  @Test (priority=2)
  public void CreateAcc() {
	  Home ob=new Home(driver);
	  ob.newAcc();
  }

}

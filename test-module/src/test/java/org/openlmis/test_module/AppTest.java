package org.openlmis.test_module;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test
	  public void LaunchBrowser() {
		  
		  System.out.println("Step: 1 - Tesco Homepaged Lanched");
	  }
	  @Test
	public void VerifyPageTitle() {
		  
		  System.out.println("Step : 2 - Verifiyed  Tile of Home page");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("TC1 - Homepage Before method --> LaunchBrowser Test Started");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("TC1 - Homepage After method --> LaunchBrowser Test Ended");

	  }
}

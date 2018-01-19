package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Applicationtest {
	
	@BeforeSuite
	
	public void beforesuit(){
		System.out.println("beforesuite");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("After suite");
	}

	 @BeforeTest
	 //before execution of each test. It will execute only for the first time
	 public void beforetest(){
		 System.out.println("Beforetest");
		 
	 }
	 @AfterTest
	 public void afterTest(){
		 System.out.println("Aftertest");
		 
	 }
	 @BeforeMethod
	 //before execution of each test
	 public void beforemethod(){
		 System.out.println("Beforemethod");
	 }
	 @AfterMethod
	 public void aftermethod(){
		 System.out.println("After method");
	 }
	 
	 
	@Test(priority=1)
	public void login(){
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("a", "b");
		sa.assertAll();
		
		//skipping the testcase
		//throw new SkipException("dont need");
	   System.out.println("login");
	}
	//logout test will pass only when login test is pass	
    @Test(priority=3, dependsOnMethods ={"login"})
    public void logout(){
       System.out.println("logout");
    }

    @Test(priority=2, dependsOnMethods={"login"})
    public void changepswd()
    {
	   System.out.println("changepswd");
	
   }
   }

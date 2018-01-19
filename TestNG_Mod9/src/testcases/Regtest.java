package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Regtest {

	@Test
	public void doreg(){
		SoftAssert sa=new SoftAssert();
		
	String ActualTitle="swathi";
	String expectedTitle="Swathi";
	System.out.println("A");
	//Assert.assertEquals(ActualTitle, expectedTitle);
	sa.assertEquals(ActualTitle, expectedTitle);
	sa.assertEquals("a", "c");
	System.out.println("B");
	sa.assertAll();//(" it will give u all error message")
	 //in console it will show 1 failure
	Assert.assertTrue(2>11, "True");
	//Assert.assertFalse(condition);
	//Assert.assertTrue(isElementPresent("xxx"), "element not found");//(will be used in present of element)	
	}
}

//if assertion fails it wont execute
//critical--stop the program/failure--Assert
//not critical/not stop/continue--SoftAssert(it is a class in TestNg)
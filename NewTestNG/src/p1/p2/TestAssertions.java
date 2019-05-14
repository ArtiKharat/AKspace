package p1.p2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertions {
	@Test
	public void m13(){
		System.out.println("inside 13");
		
		String expectdUser ="Tom";
		String actualUser ="Peter";
		
		Assert.assertEquals(actualUser,expectdUser);
	}
	@Test
	public void m14(){
		System.out.println("inside 14");
		
		String expectdUser ="Tom";
		String actualUser ="Peter";
		
		Assert.assertTrue(actualUser.equals(expectdUser), "User name not matched");
	}

}

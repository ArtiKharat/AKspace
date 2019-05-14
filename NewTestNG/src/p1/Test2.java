package p1;

import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=4)
	public void m4(){
		System.out.println("Inside m4");
	}
	@Test(priority=3)
	public void m5(){
		System.out.println("Inside m5");
	}
	@Test(priority=7)
	public void m6(){
		System.out.println("Inside m6");
			
	}
}

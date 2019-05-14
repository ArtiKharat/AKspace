package p1;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void m1(){
		System.out.println("Inside m1");
	}
	@Test(dependsOnMethods ={"m3"}, alwaysRun = true)
	public void m2(){
		System.out.println("Inside m2");
	}
	@Test
	public void m3(){
		System.out.println("Inside m3");
		int a= 1/0;
		
	}
}

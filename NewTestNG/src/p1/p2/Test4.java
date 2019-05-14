package p1.p2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
	@BeforeClass
	public void adddata(){
		System.out.println("data");
		int a=1/0;
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("login");
	}
	@Test
	public void m11() {
		System.out.println("Inside m11");
	}
	@Test
	public void m12() {
		System.out.println("Inside m12");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	@AfterClass
	public void cleanData(){
		System.out.println("data clean");
	}
}

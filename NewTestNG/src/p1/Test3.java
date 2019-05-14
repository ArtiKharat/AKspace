package p1;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups={"regression"},dependsOnGroups={"sanity"})
	public void m7(){
		System.out.println("Inside m7");
	}
	@Test(groups={"sanity"})
	public void m8(){
		System.out.println("Inside m8");
	}
	@Test(groups={"sanity"})
	public void m9(){
		System.out.println("Inside m9");
			int a= 1/0;
			
	}
	@Test(groups={"regression"},dependsOnGroups={"sanity"})
	public void m10(){
		System.out.println("Inside m10");
			
	}

}

package p1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestParameters {
	@Parameters({"url"})
	@Test
	public void setup(String appUrl){
		System.out.println("URL="+appUrl);
	}

}

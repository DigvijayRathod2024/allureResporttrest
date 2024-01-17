package alluretests2023;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	
	@Test(enabled = true)
	public void Test1() {
		
		
		System.out.println(" not skipping");
	}

	
	@Test(enabled = false)
	public void Test2() {
		
		
		System.out.println(" unknown skipping");
	}
	
	@Test
	public void Test3() {
		
		
		System.out.println(" yes skipping");
		
		throw new SkipException("skipping");
	}
}

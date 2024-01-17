package alluretests2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	
	
  @Test(description = "first test", priority = 1)
  public void test10 () {
	
	  Assert.assertEquals(true, false);
  
  }
  
  @Test(description = "second test", priority = 0)
  public void test20() {
	
	  
	  Assert.assertEquals(true, true);
}
  
  
  @Test(description = "third test", priority = 2)
  public void test30() {
	
	  
	  Assert.assertEquals(true, true);
}
  
}

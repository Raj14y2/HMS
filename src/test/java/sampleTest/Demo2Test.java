package sampleTest;

import org.testng.annotations.Test;

public class Demo2Test 
{

	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("---script3---");
	}
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("---script4---");
	}

}

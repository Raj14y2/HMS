package sampleTest;

import org.testng.annotations.Test;

public class Demo1Test
{
	@Test(groups = {"smoke","regression"})
	public void test1()
	{
		System.out.println("---script1---");
	}
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("---script2---");
	}

}

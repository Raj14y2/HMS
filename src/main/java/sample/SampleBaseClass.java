package sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleBaseClass {
	@BeforeSuite
	public void sync_BS()
	{
		System.out.println("-----BS-----");
	}
	@BeforeClass
	public void sync_BC()
	{
		System.out.println("-----BC-----");
	}
	@BeforeTest
	public void sync_BT()
	{
		System.out.println("-----BT-----");
	}
	@BeforeMethod
	public void sync_BM()
	{
		System.out.println("-----BM-----");
	}
	@AfterMethod
	public void sync_AM()
	{
		System.out.println("-----AM-----");
	}
	@AfterClass
	public void sync_AC()
	{
		System.out.println("-----AC-----");
	}
	@AfterTest
	public void sync_AT()
	{
		System.out.println("-----AT-----");
	}
	@AfterSuite
	public void sync_AS()
	{
		System.out.println("-----AS-----");
	}
	@Test
	public void test()
	{
		System.out.println("---Baseclass test---");
	}

}

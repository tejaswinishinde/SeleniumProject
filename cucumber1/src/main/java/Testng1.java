

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {

	@Test
	public void a()
	{
		System.out.println("testcase 1");
	}
	@AfterMethod
	public void b()
	{
		System.out.println("AfterMetho");
	}
	@BeforeMethod
	public void c()
	{
		System.out.println("BeforeMethod");
	}
	@AfterSuite
	public void d()
	{
		System.out.println("AfterSuite");
	}
	@BeforeSuite
	public void e()
	{
		System.out.println("BeforeSuite");
	}
	@Test
	public void f()
	{
		System.out.println("testcase 2");
	}
	@AfterClass
	public void g()
	{
		System.out.println("AfterClass");
	}
	@BeforeClass
	public void h()
	{
		System.out.println("BeforeClass");
	}
	@AfterTest
	public void i()
	{
		System.out.println("AfterClass");
	}
	@BeforeTest
	public void j()
	{
		System.out.println("BeforeClass");
	}
	
}

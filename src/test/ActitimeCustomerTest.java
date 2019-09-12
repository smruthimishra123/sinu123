package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.PomActitimeCustomer;
import pom.PomActitimeLogin;

public class ActitimeCustomerTest extends BaseTest
{
	@Test
	public void customerCreate() throws InterruptedException, IOException
	{
		PomActitimeLogin login=new PomActitimeLogin(driver);
		login.login();
		
		PomActitimeCustomer customer=new PomActitimeCustomer(driver);
		customer.createCustomer();
	}

}

package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.PomActitimeLogin;
import pom.PomActitimeWorkspace;

public class ActitimeWorkSpace extends BaseTest
{
	@Test
	public void workSpaceCreate() throws InterruptedException, IOException
	{
		PomActitimeLogin login =new PomActitimeLogin(driver);
		login.login();
		
		PomActitimeWorkspace work=new PomActitimeWorkspace(driver);
		work.createWork();
		
	}

}

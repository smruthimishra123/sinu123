package test;



import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.PomActitimeLogin;

public class ActitimeLoginTest extends BaseTest
{
   @Test
   public void login() throws IOException 
   {
	   PomActitimeLogin loginPage=new PomActitimeLogin(driver);
	   loginPage.login();
   }
}

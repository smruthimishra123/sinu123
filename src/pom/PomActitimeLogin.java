package pom;

import java.io.IOException;

import org.apache.poi.ss.excelant.ExcelAntPrecision;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class PomActitimeLogin implements AutoConstant
{
	@FindBy(id="username")
	private WebElement userNameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	//initialization
	public PomActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void login() throws IOException
	{
		userNameTextField.sendKeys(ExcelLibrary.getCellValue(excelpath, excelname, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(excelpath, excelname, 1, 1));
		loginButton.click();
	}
	public void loginMethod() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

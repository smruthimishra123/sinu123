package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class PomActitimeCustomer implements AutoConstant
{
	@FindBy(id="container_tasks")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewLink;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerLink;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="(//div[.='  Create Customer'])[1]")
	private WebElement createCustomerButton;
	
	//initialization
	public PomActitimeCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void createCustomer() throws IOException
	{
		taskLink.click();
		addNewLink.click();
		newCustomerLink.click();
		customerNameTextField.sendKeys(ExcelLibrary.getCellValue(excelpath, excelname, 1, 2));
		createCustomerButton.click();
	}

}

package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.speech.webkitSpeechRecognition;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomActitimeWorkspace  extends BasePage implements AutoConstant 
{
   @FindBy(id="Layer_1")
   private WebElement settingLink;
   
   @FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworklink;
   
   @FindBy(xpath="(//span[.='Create Type of Work']")
   private WebElement createatypesofworklink;
   
   @FindBy(id="name")
   private WebElement workName;
   
   @FindBy(xpath="//select[@name='active']")
   private WebElement dropdownlist;
   
   @FindBy(xpath="//input[@value='   Create Type of Work   ']")
   private WebElement createTypeWorkButton;
   //initialization
   public PomActitimeWorkspace(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   //utilization
   
   public void createWork() throws IOException
   {
	   settingLink.click();
	   typesofworklink.click();
	   workName.sendKeys(ExcelLibrary.getCellValue(excelpath, excelname, 1, 3));
	   selectByIndex(dropdownlist, 1);
	   createTypeWorkButton.click();
   }
}

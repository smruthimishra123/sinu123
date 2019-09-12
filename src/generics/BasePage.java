package generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void selectByIndex(WebElement ele,int index)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
    public void selectByText(WebElement ele,String text)
    {
    	Select sel=new Select(ele);
    	sel.selectByVisibleText(text);
    }
    public void selectByValue(WebElement ele,String value)
    {
    	Select sel=new Select(ele);
    	sel.selectByValue(value);
    }
}

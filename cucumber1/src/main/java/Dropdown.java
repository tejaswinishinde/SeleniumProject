

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		Thread.sleep(3000);
		
		//1st way but not recommended
		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']/option"));
		System.out.println(month.size());
		month.get(8).click();
		Thread.sleep(3000);
		System.out.println(month.get(2).isEnabled());
		System.out.println(month.get(3).isDisplayed());
				
		//2nd way - Recommneded
		WebElement Birthmonth = driver.findElement(By.xpath("//*[@id='month']"));
		Select bm=new Select(Birthmonth);
		bm.selectByIndex(10);
		Thread.sleep(3000);
		bm.selectByValue("2");
		Thread.sleep(3000);
		bm.selectByVisibleText("Jun");
		System.out.println(bm.getFirstSelectedOption().getText());
		
		//3rd store list of dropdown value
		List<WebElement> dropdown = bm.getOptions();
		for(int i=0;i<dropdown.size();i++)
		{
			String dropdownValues=dropdown.get(i).getText();
		
		if(dropdownValues.equalsIgnoreCase("Aug"))
		{
			dropdown.get(i).click();
		}
		
		
		
	}
	}
}
	



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		//mouse hover on WebElement
		WebElement Electronics=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).build().perform();;
		
		//right click on WebElement
		act.contextClick(Electronics).build().perform();
		
		//release control
		act.release(Electronics).build().perform();
		
		//press enter 
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("1");
		
		//press enter on Men
		WebElement Men=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span]"));
		act.sendKeys(Men,Keys.ENTER).build().perform();
		System.out.println("2");
		
		
		
		
		
		
		
		
		
		
	}

}

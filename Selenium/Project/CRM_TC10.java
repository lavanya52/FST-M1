package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM_TC10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.manage().window().maximize();
		 driver.findElement(By.id("user_login")).sendKeys("root");
		 
		 
		  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		 
		  driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		 
		  driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
		 
		  driver.findElement(By.linkText("Add New")).click();
		  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button")).click();
		
		 
		  driver.findElement(By.xpath("//*[@id='editor-d7adbf60-d663-4026-a736-52627dfec39c']/p")).click();
	}
}

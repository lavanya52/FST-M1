package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Lavanya");
		driver.findElement(By.id("lastName")).sendKeys("Grandhi");
		driver.findElement(By.id("email")).sendKeys("grandhilavanya52@gamil.com");
		driver.findElement(By.id("number")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='simpleForm']/div/div[5]/textarea")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id='simpleForm']/div/div[6]/div[1]/input")).click();
		driver.close();
	}
	

}

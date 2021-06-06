package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Grandhi");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("grandhilavanya52@gamil.com");
		driver.findElement(By.xpath("//*[@id='number']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='simpleForm']/div/div[5]/textarea")).sendKeys("ABC");
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		driver.close();

	}

}

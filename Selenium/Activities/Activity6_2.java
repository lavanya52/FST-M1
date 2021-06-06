package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/ajax");
		driver.manage().window().maximize();
		System.out.println("Title of page=" + driver.getTitle());
		driver.findElement(By.xpath("//*[@class='ui violet button']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
		   String ajaxText = driver.findElement(By.id("ajax-content")).getText();
		 System.out.println(ajaxText);
	        
	        //Wait for late text
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	        
	        //Get late text and print it
	        String lateText = driver.findElement(By.id("ajax-content")).getText();
	        System.out.println(lateText);
	 
	        //Close browser
	        driver.close();
		

	}

}

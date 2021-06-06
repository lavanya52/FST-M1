package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		driver.manage().window().maximize();
		System.out.println("Title of page=" + driver.getTitle());
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Lavanya1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("lavusmca1");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("lavusmca1");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("grandhi1@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		 String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	        System.out.println("Login message: " + loginMessage);
		driver.close();
	}

}

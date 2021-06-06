package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		driver.manage().window().maximize();
		System.out.println("Title of page=" + driver.getTitle());
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		String loginMessage=driver.findElement(By.xpath("//*[@id='action-confirmation']")).getText();
		System.out.println("LoginMessage="+loginMessage);
		driver.close();
	}

}

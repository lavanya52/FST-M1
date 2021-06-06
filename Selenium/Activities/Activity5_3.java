package SeleniumFST;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		System.out.println("titile of page=" + driver.getTitle());
		WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));

		// Print status
		System.out.println("The checkbox is selected: " + textInput.isEnabled());

		driver.findElement(By.id("toggleInput")).click();

		// Print status
		System.out.println("The checkbox is selected: " + textInput.isEnabled());

		// Close the browser
		driver.close();

	}

}

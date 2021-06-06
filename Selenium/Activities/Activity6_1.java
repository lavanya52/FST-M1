package SeleniumFST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		System.out.println("Title of page=" + driver.getTitle());
		WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

		// Click the toggle button
		toggleCheckboxButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Wait for checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));

		// Click toggle button again
		toggleCheckboxButton.click();

		// Wait for checkbox to appear

		checkbox.click();

		// Close browser
		// driver.close();

	}
}

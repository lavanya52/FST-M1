package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		driver.manage().window().maximize();
		System.out.println("titile of page="+driver.getTitle());
		WebElement b=driver.findElement(By.xpath("//*[@type='checkbox']"));
		System.out.println("The check box input is displayed="+b.isDisplayed());
		driver.findElement(By.xpath("//*[@id='toggleCheckbox']")).click();
		System.out.println("remove of the check box input is displayed="+b.isDisplayed());
		driver.close();

	}

}

package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net");
		driver.manage().window().maximize();
		System.out.println("Page title="+driver.getTitle());
		driver.findElement(By.id("about-link")).click();
		System.out.println("new Page title="+driver.getTitle());
		driver.close();

	}

}

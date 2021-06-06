package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class CRM_TC07_ReadingAdditionalInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).submit();
		driver.findElement(By.id("grouptab_0")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		driver.findElement(By.xpath("(//*[@class='suitepicon suitepicon-action-info'])[2]")).click();
		WebElement mo = driver.findElement(By.xpath(".//div[@id='ui-id-5']/span"));
		String mobile = mo.getText();
		System.out.println("Mobile is:" + mobile);
		driver.close();

	}

}

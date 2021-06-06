package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class CRM_TC01_VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		String ExpecResult=driver.findElement(By.linkText("SuiteCRM")).getText();
		System.out.println("ExpecResult="+ExpecResult);
		String ActualResult="SuiteCRM";
		Assert.assertEquals(ExpecResult, ActualResult);
		System.out.println("Title is matched");
	     Thread.sleep(1000);
		driver.close();
		
		

	}

}


package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//@Test(priority=1)

public class CRM_TC03_GetCopyRightText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		String copyrightImage=driver.findElement(By.id("admin_options")).getText();
		System.out.println("copy right of title is="+copyrightImage);
		driver.close();

	}

}

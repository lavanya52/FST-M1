package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM_TC02_GetTheHeaderImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		WebElement image=driver.findElement(By.xpath("//*[@id='form']/div[1]/img"));
		System.out.println("get the URL="+image.getAttribute("src"));
		driver.close();
		

	}

}

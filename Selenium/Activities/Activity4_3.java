package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		driver.manage().window().maximize();
		System.out.println("Title of the page="+driver.getTitle());
		String thirdheader=driver.findElement(By.xpath("//*[@id='third-header']")).getText();
		System.out.println("Third header="+thirdheader);
		String color=driver.findElement(By.xpath("//*[@class='ui green header']")).getCssValue("colour");
		System.out.println("Fifth headding color="+color);
		String voiletcolor=driver.findElement(By.xpath("//*[@class='ui violet button']")).getCssValue("class");
		System.out.println("class attribute="+voiletcolor);
		
		String greycolor=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("class attribute="+greycolor);
		driver.close();
	}

}

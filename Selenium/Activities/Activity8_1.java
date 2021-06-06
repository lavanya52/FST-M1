package SeleniumFST;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GrandhiLavanya\\Downloads\\chromedriver_win89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		driver.manage().window().maximize();
		System.out.println("Title of page=" + driver.getTitle());
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		// Get rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));

		// Number of columns
		System.out.println("Number of columns are: " + cols.size());
		// Number of rows
		System.out.println("Number of rows are: " + rows.size());
		List<WebElement> r = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]"));
		for (WebElement cellValue : r) {
			System.out.println(cellValue.getText());
		}
		String secondval = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"))
				.getText();
		System.out.println("second value=" + secondval);

	}

}

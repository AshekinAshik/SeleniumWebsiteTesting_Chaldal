package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ChangeLocationScript {

	public static void main(String[] args) {
		///providing the path to set up chrome driver in the project
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		//instatiate chrome driver class
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chaldal.com/");
		driver.manage().window().maximize();
		
		WebElement locationArrow = driver.findElement(By.className("arrow-down"));
		locationArrow.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement changeCity = driver.findElement(By.xpath("//div[@class='citySelectionLink hidden-xs']//div[@class='headerAddressComponent visible']//div//div[@class='change-city']//div"));
		changeCity.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement selectCity = driver.findElement(By.xpath("//p[normalize-space()='Chattogram']"));
		selectCity.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}

package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SearchScript {

	public static void main(String[] args) {
		//providing the path to set up chrome driver in the project
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		//instatiate chrome driver class
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chaldal.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("search_term_string"));
		searchBox.sendKeys("Milk");
		searchBox.submit();
		
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		searchBox.clear();
		searchBox = driver.findElement(By.name("search_term_string"));
		searchBox.sendKeys("Chocolate");
		searchBox.submit();
		
		try {
			 Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}

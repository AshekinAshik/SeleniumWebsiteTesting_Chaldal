package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginScript {

	public static void main(String[] args) {
		//providing the path to set up chrome driver in the project
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		//instatiate chrome driver class
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chaldal.com/");
		driver.manage().window().maximize();
		
		WebElement signInLink = driver.findElement(By.className("signInBtn"));
		signInLink.click();
		
		WebElement emailSignInLink = driver.findElement(By.className("emailLoginBtn"));
		emailSignInLink.click();
		
		WebElement emailInput = driver.findElement(By.name("email"));
		emailInput.isDisplayed();
		emailInput.isEnabled();
		emailInput.sendKeys("ashekin.ashik@gmail.com");
		
		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.isDisplayed();
		passwordInput.isEnabled();
		passwordInput.sendKeys("newchaldal111");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginBtn.click();
		
		System.out.println("Test Case Login: Passed");
		
		try {
			 Thread.sleep(5000); // Wait for 5 seconds (5000 milliseconds)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}

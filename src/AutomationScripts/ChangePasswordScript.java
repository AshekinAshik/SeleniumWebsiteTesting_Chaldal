package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ChangePasswordScript {

	public static void main(String[] args) {
		//providing the path to set up chrome driver in the project
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		//instatiate chrome driver class
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chaldal.com/");
		driver.manage().window().maximize();
		
		//logging into account
		WebElement signInLink = driver.findElement(By.className("signInBtn"));
		signInLink.click();
		WebElement emailSignInLink = driver.findElement(By.className("emailLoginBtn"));
		emailSignInLink.click();
		WebElement emailInput = driver.findElement(By.name("email"));
		emailInput.sendKeys("ashekin.ashik@gmail.com");
		WebElement passwordInput = driver.findElement(By.name("password"));
		passwordInput.sendKeys("newchaldal111");
		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginBtn.click();
		try {
			 Thread.sleep(4000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get("https://chaldal.com/customer/changepassword");
		WebElement oldPassword = driver.findElement(By.name("oldPassword"));
		oldPassword.sendKeys("newchaldal111");
		WebElement newPassword1 = driver.findElement(By.name("newPassword1"));
		newPassword1.sendKeys("chaldal111");
		WebElement newPassword2 = driver.findElement(By.name("newPassword2"));
		newPassword2.sendKeys("chaldal111");
		WebElement changePasswordBtn = driver.findElement(By.xpath("//div[@class='actionButtons']//button[@type='submit']"));
		changePasswordBtn.click();
		try {
			 Thread.sleep(4000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}

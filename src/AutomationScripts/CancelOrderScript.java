package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CancelOrderScript {

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
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		WebElement myAccountLink = driver.findElement(By.className("text"));
//		myAccountLink.click();
//		try {
//			 Thread.sleep(2000); // Wait for 2 seconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		WebElement myaccountLink = driver.findElement(By.xpath("//div[@class='loginArea loggedIn area-with-dropdown area hidden-xs']"));
		Actions action = new Actions(driver);
		action.moveToElement(myaccountLink).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		driver.get("https://chaldal.com/customer/orders");
		
		WebElement myOrderLink = driver.findElement(By.xpath("//a[normalize-space()='Your Orders']"));
		myOrderLink.click();
		
		WebElement viewOrderLink = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='app catalog navOpen chaldal-theme']/div[@class='everythingElseWrapper']/section[@class='bodyTable']/div/div[@class='order-history-page']/div[@class='order-list']/div[2]/div[1]/div[1]/div[1]"));
		viewOrderLink.click();
		
		WebElement cancelOrderBtn = driver.findElement(By.className("cancelOrderBtn"));
		cancelOrderBtn.click();
		try {
			 Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}

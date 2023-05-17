package AutomationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AddCartScript {

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
		
		//searching products and adding to cart
		WebElement searchBox = driver.findElement(By.name("search_term_string"));
		searchBox.sendKeys("Green Apple");
		searchBox.submit();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement searchResult = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='app catalog navOpen chaldal-theme']/div[@class='everythingElseWrapper']/section[@class='bodyTable']/div/div[@class='catalogBrowser']/div[@class='loaded']/div/section[@class='bodyWrapper']/div[@class='categorySection miscCategorySection onlyMiscCategorySection']/div[@class='productPane']/div[1]/div[1]"));
		searchResult.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		searchBox.clear();
		searchBox = driver.findElement(By.name("search_term_string"));
		searchBox.sendKeys("Harpic");
		searchBox.submit();
		try {
			 Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchResult = driver.findElement(By.xpath("//body/div[@id='page']/div[@class='app catalog navOpen chaldal-theme']/div[@class='everythingElseWrapper']/section[@class='bodyTable']/div/div[@class='catalogBrowser']/div[@class='loaded']/div/section[@class='bodyWrapper']/div[@class='categorySection miscCategorySection onlyMiscCategorySection']/div[@class='productPane']/div[1]/div[1]"));
		searchResult.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement cardBtn = driver.findElement(By.className("stickyHeader"));
		cardBtn.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement orderBtn = driver.findElement(By.id("placeOrderButton"));
		orderBtn.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement confirmOrderBtn = driver.findElement(By.cssSelector(".confirmBtn.confirmOrder"));
		confirmOrderBtn.click();
		try {
			 Thread.sleep(3000); // Wait for 3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}

package AutomationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductScript {

	public static void main(String[] args) {
		//providing the path to set up chrome driver in the project
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		//instatiate chrome driver class
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chaldal.com/");
		driver.manage().window().maximize();
		
		WebElement foodLink = driver.findElement(By.linkText("Food"));
		foodLink.click();
		WebElement fruitandvegLink = driver.findElement(By.linkText("Fruits & Vegetables"));
		fruitandvegLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement freshvegLink = driver.findElement(By.linkText("Fresh Vegetables"));
		freshvegLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement freshfruitLink = driver.findElement(By.linkText("Fresh Fruits"));
		freshfruitLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement meatandfishLink = driver.findElement(By.linkText("Meat & Fish"));
		meatandfishLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement chickenLink = driver.findElement(By.linkText("Chicken & Poultry"));
		chickenLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement meatLink = driver.findElement(By.linkText("Meat"));
		meatLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement cookingLink = driver.findElement(By.linkText("Cooking"));
		cookingLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement spicesLink = driver.findElement(By.linkText("Spices"));
		spicesLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement riceLink = driver.findElement(By.linkText("Rice"));
		riceLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement oilLink = driver.findElement(By.linkText("Oil"));
		oilLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement dairyandeggsLink = driver.findElement(By.linkText("Dairy & Eggs"));
		dairyandeggsLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement breakfastLink = driver.findElement(By.linkText("Breakfast"));
		breakfastLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement cleaningLink = driver.findElement(By.linkText("Cleaning Supplies"));
		cleaningLink.click();
		try {
			 Thread.sleep(2000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement fashionandlifestylLink = driver.findElement(By.linkText("Fashion & Lifestyle"));
		fashionandlifestylLink.click();
		
		try {
			 Thread.sleep(4000); // Wait for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}

}

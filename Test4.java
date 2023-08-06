import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
	//import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	//import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

WebDriver driver;
	
	@BeforeTest
	void setup()
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://trupathebrothers.ro/");
        driver.manage().window().maximize();
	}
	
	@AfterTest
	void close() {
		driver.close();
		driver.quit();
	}
	
	@Test
	void test() throws InterruptedException {
		//Hover test
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,100)");
			Thread.sleep(3000);		
			WebElement membru1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]"));
			Actions action = new Actions(driver);
			action.moveToElement(membru1).perform();
			Thread.sleep(3000);	
			WebElement membru2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]"));
			Actions action2 = new Actions(driver);
			action2.moveToElement(membru2).perform();
			Thread.sleep(3000);
			WebElement membru3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[3]"));
			Actions action3 = new Actions(driver);
			action3.moveToElement(membru3).perform();
			Thread.sleep(3000);	
}
}
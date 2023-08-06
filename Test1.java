
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.support.ui.WebDriverWait;
	//import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	//import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	
	
public class Test1 {

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
	// Video Gallery 
		
		driver.findElement(By.xpath("//header/div[@id='site-header-inner']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
			Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)");
			Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,450)");	
			Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/article/div/div/section[4]/div/div/div/section[4]/div/div[1]/div/div")).click();
			Thread.sleep(1000);
		WebElement singleFrame = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/article/div/div/section[4]/div/div/div/section[4]/div/div[1]/div/div/div/div/iframe"));
			driver.switchTo().frame(singleFrame);
			Thread.sleep(5000);
			{

	}
 
	}
			}
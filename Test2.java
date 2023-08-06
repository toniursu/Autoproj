import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	//import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;


public class Test2 {

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
	// Photo Gallery
		
		driver.findElement(By.xpath("/html/body/div/div/header/div[1]/div/section/div/div[2]/div/div/div/nav[1]/ul/li[4]/a")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/article/div/div/section[5]/div/div/div/div[3]/div/div/a[5]/div[2]")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]")).click();
			Thread.sleep(3000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,-4000)");
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/section/div/div[2]/div/div/div/nav[1]/ul/li[2]/a")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/section[2]/div[2]/div/div/div[6]/div/div/a")).click();
			Thread.sleep(2000);
			WebElement locatie = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/article/div/div/section[8]/div/div/div/section/div/div[1]"));
			Assert.assertEquals(locatie.isDisplayed(),true);
			WebElement telefon = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/article/div/div/section[8]/div/div/div/section/div/div[2]"));
			Assert.assertEquals(telefon.isDisplayed(),true);
			WebElement email = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/article/div/div/section[8]/div/div/div/section/div/div[3]"));
			Assert.assertEquals(email.isDisplayed(),true);
			
			
	} 

 {

}
}
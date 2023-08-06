import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Test3 {

	
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
	//Social Media Buttons
		
		Thread.sleep(2000);
		String originalWindow =driver.getWindowHandle();
	    	assert driver.getWindowHandles().size()==1;
	    WebElement facebook = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]"));
			if(facebook.isDisplayed()== true) {
				facebook.click();}
			assert driver.getWindowHandles().size() ==2; 
			
			for(String windowHandle : driver.getWindowHandles()) {
				if(!originalWindow.contentEquals(windowHandle)) {
					driver.switchTo().window(windowHandle);
					break;
				}		
		}	
			Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/TrupaTheBrothers");	
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div")).click();
			Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
   			js.executeScript("window.scrollBy(0,200)");	
   			Thread.sleep(2000);
   		JavascriptExecutor js2 = (JavascriptExecutor) driver;
   			js2.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
   		JavascriptExecutor js3 = (JavascriptExecutor) driver;
   			js3.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
   		JavascriptExecutor js4 = (JavascriptExecutor) driver;
   			js4.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
  
   			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(originalWindow);
			Thread.sleep(2000);
		
			
			WebElement instagram = driver.findElement(By.xpath("/html/body/div/div/header/div[1]/div/section/div/div[3]/div/div/div/div/span[2]/a"));
			if(instagram.isDisplayed()== true) {
				instagram.click();}
			assert driver.getWindowHandles().size() ==2; 
			
			for(String windowHandle : driver.getWindowHandles()) {
				if(!originalWindow.contentEquals(windowHandle)) {
					driver.switchTo().window(windowHandle);
					break;
				}		
		}	
			Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/trupa.the.brothers/");
			Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/button[1]")).click();
			Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
   			js5.executeScript("window.scrollBy(0,200)");	
   			Thread.sleep(1000);
   		JavascriptExecutor js6 = (JavascriptExecutor) driver;
   			js6.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(1000);
   		JavascriptExecutor js7 = (JavascriptExecutor) driver;
   			js7.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(1000);
   		JavascriptExecutor js8 = (JavascriptExecutor) driver;
   			js8.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
			
   			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(originalWindow);
			Thread.sleep(2000);
			
			WebElement youtube = driver.findElement(By.xpath("/html/body/div/div/header/div[1]/div/section/div/div[3]/div/div/div/div/span[3]/a"));
			if(youtube.isDisplayed()== true) {
				youtube.click();}
			assert driver.getWindowHandles().size() ==2; 
			
			for(String windowHandle : driver.getWindowHandles()) {
				if(!originalWindow.contentEquals(windowHandle)) {
					driver.switchTo().window(windowHandle);
					break;
				}		
		}	
			
			Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://consent.youtube.com/m?continue=https%3A%2F%2Fwww.youtube.com%2Fchannel%2FUC3fuJngU81xlCcMEIAe72sQ%3Fcbrd%3D1&gl=RO&m=0&pc=yt&cm=2&hl=en&src=1");
			Thread.sleep(2000);
		JavascriptExecutor jsyt= (JavascriptExecutor) driver;
   			jsyt.executeScript("window.scrollBy(0,300)");
   			Thread.sleep(1000);
   		driver.findElement(By.xpath("/html/body/c-wiz/div/div/div/div[2]/div[1]/div[3]/div[1]/form[2]/div/div/button")).click();
			Thread.sleep(2000);
		JavascriptExecutor js9 = (JavascriptExecutor) driver;
   			js9.executeScript("window.scrollBy(0,200)");	
   			Thread.sleep(2000);
   		JavascriptExecutor js10 = (JavascriptExecutor) driver;
   			js10.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
   		JavascriptExecutor js11 = (JavascriptExecutor) driver;
   			js11.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
   		JavascriptExecutor js12 = (JavascriptExecutor) driver;
   			js12.executeScript("window.scrollBy(0,200)");
   			Thread.sleep(2000);
			
   			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(originalWindow);
			Thread.sleep(1000);
			
			 
}

 {

}
}
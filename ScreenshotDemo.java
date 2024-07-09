package FramesHandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/?locale2=en_GB&_rdr");
      WebElement input=driver.findElement(By.id("email"));
      input.sendKeys("imma");
      takeshot(driver);
      WebElement pass=driver.findElement(By.id("pass"));
      pass.sendKeys("123");
      takeshot(driver);
      WebElement log=driver.findElement(By.name("login"));
      log.click();      
      takeshot(driver);
	}
	public static void takeshot(WebDriver driver) throws IOException {
		TakesScreenshot tss= (TakesScreenshot) driver;
		File imge=  tss.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/facebook"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(imge, dest);
		
	}

}

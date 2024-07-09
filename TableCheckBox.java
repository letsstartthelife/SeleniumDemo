package FramesHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     
     List<WebElement> tb=driver.findElements(By.xpath("//div[@id='HTML8']//tr/td/input[@type='checkbox']"));
     for(WebElement tbs : tb)
     {
    	 if(!tbs.isSelected()) {
    		 tbs.click();
    	 }
     }
     
    
    	
     
     
	}

}

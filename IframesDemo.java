package FramesHandling;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		//WebElement dims=driver.findElement(By.xpath("//b[@id=\"topic\"]"));
		//System.out.println(dims.getText());
		//WebElement outer=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//driver.switchTo().frame(outer);
		//WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		//input.sendKeys("java");
		//WebElement inner=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		//driver.switchTo().frame(inner);
		
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
		//checkbox.click();
		WebElement deep =driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(deep);
		WebElement cat=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(cat);
		s.selectByIndex(2);
		//s.selectByValue("avatar");
		//s.selectByVisibleText("Baby Cat");
	}

}

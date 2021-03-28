package assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus{

public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();;
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("C");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("b");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='onward_cal']")).sendKeys(keysToSend);;
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr//td[3]")).click();	
	driver.findElement(By.xpath("//td[text()='1']")).click();
	driver.findElement(By.xpath("//button[@id='search_btn']")).click();
	System.out.println("total buses+"+driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText());

	driver.findElement(By.xpath("div[@class='close']/i")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='filter-block']//ul[3]//li[2]/label[1]")).click();
	System.out.println("Sleeper/Ac buses"+driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText());
	driver.findElement(By.xpath("//div[@id='filter-block']//ul[3]//li[3]/label[1]")).click();
	
	System.out.println("Ac buses"+driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText());

	
	
	
	driver.close();
				
			}
			

}
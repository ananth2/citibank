package cvm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//adding cvm

public class CVMTest {
	
	public static WebDriver dr=null;
	
	@BeforeTest
	
	public void beforeTest() throws InterruptedException{
		
		dr=new FirefoxDriver();
		dr.get("http://webtest.xerago.com/cvm");
		Thread.sleep(3000);
		dr.manage().window().maximize();
		dr.findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("cvmcreatortest");
		dr.findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[2]/form/div[3]/input")).sendKeys("cvmcreator@123");
		dr.findElement(By.xpath("html/body/div[3]/div[2]/div/div/div[2]/form/p/button")).click();
		
	}

	
	@Test
	
	public void test() throws InterruptedException{
	Thread.sleep(5000);	
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[3]/div/button[1][contains(text(),'ON')]")).click();
//	dr.manage().window().maximize();
	Thread.sleep(1000);
	JavascriptExecutor js1=(JavascriptExecutor)dr;
	js1.executeScript("window.scrollBy(500,0)");
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/div[1]/ul/li[2]/a")).click();
	Thread.sleep(5000);	
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[5]/div[1]/div/div[6]/div")).sendKeys("Debit");
	Thread.sleep(3000);
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[5]/div[1]/div/div[5]/div/a[contains(text(),'Filter')]")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[5]/div/div/div[5]/div/ul/li[2]/div/label[1]/label[contains(@for,'category2')]")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[5]/div/div/div[5]/div/ul/li[3]/div/label[2]/label[contains(@for,'product3')]")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[5]/div/div/div[5]/div/ul/div/button[1][contains(text(),'Apply')]")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[6]/div/div[2]/div[1]")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[6]/div/div[2]/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/ul/li[2]/a/span[2][contains(text(),'Edit')]")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/button")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[6]/div/div[2]/div[1]")).click();
	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[6]/div/div[2]/div[1]/table/tbody/tr/td/table/tbody/tr[2]/td[3]/ul/li[3]/a[contains(@alt,'Edit Communication')]")).click();
	//Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)dr;
	  js.executeScript("window.scrollBy(0,100)");
//	dr.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[3]/div[2]/div/div/button[2]")).click();
	
/*WebElement we=	dr.findElement(By.xpath("html/body/div[3]/div[2]/div[6]/div/div[2]/div[1]/table/tbody/tr[1]/td"));
we.click();
dr.findElement(By.xpath("html/body/div[3]/div[2]/div[6]/div/div[2]/div[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/ul/li[1]/a/span[1]")).click();*/
	
	
		
	}
}

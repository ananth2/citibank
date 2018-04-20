package citibank;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class App {
	
	
	/*public static List<String> errorList = new ArrayList<String>();
	   ExecutorService executor;
	   FirefoxDriver driver;
	  
	   @Test
	   public void URLCheckTest() throws IOException, InterruptedException
	   {
	 
	       
	   //    System.setProperty("webdriver.chrome.driver", "chromedrivermac");
	       driver = new FirefoxDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.xerago.com");
			Thread.sleep(3000);
	List<WebElement> linklst=     driver.findElements(By.tagName("a"));
	linklst.addAll(driver.findElements(By.tagName("img")));
	System.out.println(linklst.size());
	List<WebElement>activelnks=new ArrayList<WebElement>();
	Thread.sleep(3000);
	for(int i=0;i<linklst.size();i++){
		
		if(linklst.get(i).getAttribute("href")!=null &&(! linklst.get(i).getAttribute("href").contains("javascript"))){
			activelnks.add(linklst.get(i));
		}
		
	}
	System.out.println(activelnks.size());
	
	for(int j=0;j<activelnks.size();j++){
		
		
		HttpURLConnection con=	(HttpURLConnection)	new URL(activelnks.get(j).getAttribute("href")).openConnection();
		con.connect();
		Thread.sleep(3000);
	String response=	con.getResponseMessage();
		con.disconnect();
		Thread.sleep(3000);
		System.out.println(activelnks.get(j).getAttribute("href")+"----"+response);
	}
	
	   }	      */
	
	 
    
    
}

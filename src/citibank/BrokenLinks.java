package citibank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	
	public static WebDriver dr;

	public static void main(String[] args) {
		dr=new FirefoxDriver();
		dr.get("http://google.com");
		

	}

}

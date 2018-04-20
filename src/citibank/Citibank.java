package citibank;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Citibank {

	public static WebDriver dr=null;
	public static void main(String[] args) throws InterruptedException {
	dr=new FirefoxDriver();
	dr.manage().window().maximize();
	dr.get("http://demo.xerago.com/clients/citibank/2018/citibank-india/website/Liabilities/");
	dr.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("ananth");;
	dr.findElement(By.xpath("//input[contains(@id,'Email_Id')]")).sendKeys("xyz@yopmail.com");;
	dr.findElement(By.xpath("//select[contains(@id,'Gender')]/child::option[2][contains(text(),'Male')]")).click();
	dr.findElement(By.xpath("//div[contains(@class,'col-rgt date c-bg')]")).click();
	//Thread.sleep(3000);
	dr.findElement(By.xpath("html/body/div[2]/div/div/select[2]/child::option[3][contains(text(),'1955')]")).click();
	dr.findElement(By.xpath("html/body/div[2]/table/tbody/tr[4]/td[1]/a[contains(text(),'16')]")).click();
	
	
	dr.findElement(By.xpath("//input[contains(@id,'Mobile')]")).sendKeys("9741005278");
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[1]/div[2]/div[4]/a[contains(text(),'PROCEED')]")).click();
//	Thread.sleep(6000);
	dr.findElement(By.xpath("//input[contains(@id,'Aadhar') and @name='Aadhar']")).sendKeys("162569964904");
	dr.findElement(By.xpath("//select[contains(@id,'maritalStatus')]/child::option[2][contains(text(),'Married')]")).click();
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[2]/div[2]/div[3]/div/div/label[1][contains(text(),'Spouse')]")).click();
	dr.findElement(By.xpath("//input[contains(@id,'Spousename') and @name='Spousename']")).sendKeys("kavitha");
	dr.findElement(By.xpath("//select[contains(@id,'Graduate')]/child::option[2][contains(text(),'Graduate')]")).click();
	dr.findElement(By.xpath("//select[contains(@id,'Nationality') and @name='Nationality']/child::option[2][contains(text(),'Indian')]")).click();
	dr.findElement(By.xpath("//select[contains(@id,'residentialStatus') and @name='residentialStatus']/child::option[2][contains(text(),'Resident Individual')]")).click();
	dr.findElement(By.xpath("//input[contains(@id,'PAN') and @name='PAN']")).sendKeys("AGEPA4578K");
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[2]/div[2]/div[9]/a[contains(text(),'PROCEED')]")).click();
	dr.findElement(By.xpath("//input[contains(@id,'Permanentbldngname') and @name='Current Bldng Name/no']")).sendKeys("asdsdasdada");
	dr.findElement(By.xpath("//input[contains(@id,'PermanentstreetName') and @name='Current Street Name']")).sendKeys("dsdsdddafff");
	dr.findElement(By.xpath("//input[contains(@id,'PermanentPer_arealocal') and @name='Current Area / Locality']")).sendKeys("ewewqeqwewqeqwe");
	dr.findElement(By.xpath("//select[contains(@id,'PermanentCityval')]/child::option[3][contains(text(),'Bengaluru')]")).click();
	dr.findElement(By.xpath("//select[contains(@id,'Permanentoff_districtid')]/child::option[3][contains(text(),'Bengaluru')]")).click();
	dr.findElement(By.xpath("//select[contains(@id,'PermanentStateval')]/child::option[3][contains(text(),'Karnataka')]")).click();
	dr.findElement(By.xpath("//input[contains(@id,'PermanentPincode_num') and @name='Current Pincode']")).sendKeys("560076");
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[3]/div[2]/div[8]/div/div[2]/label[1][contains(text(),'Yes')]")).click();
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[3]/div[2]/div[10]/div[1]/div[2]/label[1][contains(text(),'Aadhaar')]")).click();
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[3]/div[2]/div[10]/div[2]/div[2]/label[1][contains(text(),'Aadhaar')]")).click();
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[3]/div[2]/div[11]/a[contains(text(),'PROCEED')]")).click();
	Thread.sleep(2000);
	dr.findElement(By.xpath("//select[contains(@id,'PROFESSION')]/child::option[2][contains(text(),'Salaried')]")).click();
	dr.findElement(By.xpath("//input[contains(@id,'showVal') and @name='companyname']")).sendKeys("a");
	String path="html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[1]/div[2]/ul/li[1]";
	String first="html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[1]/div[2]/ul/li[";
	String second="]";
	for(int i=1;i<355;i++){
	System.out.println(	dr.findElement(By.xpath(first+i+second)).getText());
		
	}
	
	//-------------------x--------------x------------------------------------------
	
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[1]/div[2]/ul/li[1][contains(text(),'Wipro')]")).click();
	dr.findElement(By.xpath("//input[contains(@id,'Designation') and @name='Designation']")).sendKeys("manager");
	dr.findElement(By.xpath("//input[contains(@id,'grossAnnualIncome') and @name='grossAnnualIncome']")).sendKeys("800000");
	dr.findElement(By.xpath("//input[contains(@id,'bldngname') and @name='Bldng Name/no']")).sendKeys("xyz");
	dr.findElement(By.xpath("//input[contains(@id,'streetName') and @name='Street Name']")).sendKeys("xyzasas");
	dr.findElement(By.xpath("//input[contains(@id,'Per_arealocal') and @name='Area / Locality']")).sendKeys("xyzasas");
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[5]/div[2]/select[contains(@id,'Cityval')]/option[3][contains(@value,'Bengaluru')] ")).click();
	dr.findElement(By.xpath("//select[contains(@id,'off_districtid')and @name='District']/child::option[3][contains(text(),'Bengaluru')]")).click();
	Thread.sleep(3000);
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[6]/div[2]/select[contains(@id,'Stateval')]/option[3][@value='Karnataka']")).click();
	Thread.sleep(2000);
	
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[7]/div[1]/input[contains(@id,'Pincode_num') and @name='Pincode']")).sendKeys("560076");
//	dr.findElement(By.xpath("//input[contains(@id,'stdcode') and @name='STD code']")).sendKeys("080");
	dr.findElement(By.xpath("html/body/div[1]/div/div/div[2]/form/div[4]/div[2]/div[9]/div/div[2]/label[2][contains(text(),'Office Address')]")).click();
	
	
	
	

	}

}

package Class1;

import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.Calendar;
//import java.util.List;
//import java.util.TimeZone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class SignUpSpicJet {

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Eventbuizz\\eclipse-workspace\\Selenuim1\\ChromeWebdriver\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver=  new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  
		  driver.get("https://book.spicejet.com/search.aspx");
		  
		  
		  driver.findElement(By.xpath("//a[@id='Login']")).click();
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.linkText("SIGN UP")).click();
		  
		  Thread.sleep(5000);
		  
		  Select select = new Select(driver.findElement(By.xpath("//select[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']")));
	  
		  Thread.sleep(2000);
		  
    	  select.selectByVisibleText("MR");
		  
		  driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$TextBoxFirstName")).sendKeys("Usman");	  
		  
     	  Thread.sleep(2000);
		  
		  driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$TextBoxLastName")).sendKeys("Shah");	  
		  
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//div[@class='selected-dial-code']")).click();
    	  
    	  Thread.sleep(3000);
    	  
    	  List <WebElement> list = driver.findElements(By.xpath("//ul[@id = 'country-listbox']/li/span[@class='country-name']"));
    	  
    	  System.out.println(list.size());
    	  
    	  
    	  Thread.sleep(3000);
    	  
    	  for(int i=0; i<list.size(); i++)
    	  {
    		  
    		  System.out.println(list.get(i).getText());
    		  
    		  if(list.get(i).getText().contains("Pakistan")) 	  
    			  
    		  {
    			  list.get(i).click();
    		  }   
    	  }
    	  
    	  driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER")).sendKeys("3207801144");
    	  
    	  Thread.sleep(3000);
    	  
    	  driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword")).sendKeys("W33#moto123");
    	  
    	   Thread.sleep(3000);
    	   
    	  driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm")).sendKeys("W33#moto123");
    	  
    	  
    	  driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB")).click();
    	  
    	  driver.findElement(By.xpath("//th[@class='datepickerGoPrev']//a//span")).click();
    	  
    	  Thread.sleep(2000);
    	  
    	  driver.findElement(By.xpath("//span[contains(text(),'1994')]")).click();
    	  
    	  Thread.sleep(2000);
    	  
    	  
    	 driver.findElement(By.xpath("//span[contains(text(),'Aug')]")).click();
    	 
    	 
    	 Thread.sleep(2000);
    	 
    	
    	driver.findElement(By.xpath("//td[@class='validDate']//span[contains(text(),'19')]")).click();
    	
    	
    	Thread.sleep(3000);

    	
    	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail")).sendKeys("m.usmanrafaqat@gmail.com");
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("chkSpiceClubTnC")).click();
    	
    	Thread.sleep(2000);
    	
    	
    	driver.findElement(By.cssSelector("[id=\"CONTROLGROUPREGISTERVIEW_ButtonSubmit\"]")).click();
    	  
    	  
    	  
    	  
   
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    		  
   
		
		
		
		
		
		
	}

}

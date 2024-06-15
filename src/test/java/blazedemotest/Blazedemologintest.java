package blazedemotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazedemorepository.Blazedemopage;

public class Blazedemologintest {
	
	
WebDriver driver1;
	

//	WebDriver driver;
	String pagelink="https://blazedemo.com/login";
	
	@BeforeTest
	public void setup()
	{
		driver1=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		System.out.println("URL Open");
        driver1.get(pagelink);
		
		driver1.manage().window().maximize();
	}
	
	
	@Test
	public void testLogin() {
		Blazedemopage ob=new Blazedemopage(driver1);//Create object for the class
	ob.setvalueslogin("abc@gmail.com", "abc@05");
	ob.login();
	
	}

}

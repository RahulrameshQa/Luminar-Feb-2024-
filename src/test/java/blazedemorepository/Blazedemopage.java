package blazedemorepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemopage {

WebDriver driver1;
	
	By bdname=By.id("name");
	By bdcompany=By.id("company");
	By bdemail=By.id("email");
	By bdpassword=By.id("password");
	By bdcpassword=By.id("password-confirm");
	By regbtn=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	
	By bdemaillog=By.id("email");
	By bdpasswordlog=By.id("password");
	By loginbtn=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	
	
	
	
	public Blazedemopage (WebDriver driver1) {
		this.driver1 = driver1;//Constroctor:- Passing values to initial variables
	}
	
	
	public void setvaluesregister(String name,String company,String email,String password ) {
		driver1.findElement(bdname).sendKeys(name);
		driver1.findElement(bdcompany).sendKeys(company);
		driver1.findElement(bdemail).sendKeys(email);
		driver1.findElement(bdpassword).sendKeys(password);
		driver1.findElement(bdcpassword).sendKeys(password);
	
		
	}
	
  
	public void register() {
	driver1.findElement(regbtn).click();
		
	}


   
	public void setvalueslogin(String email,String password ) {
	
	driver1.findElement(bdemaillog).sendKeys(email);
	driver1.findElement(bdpasswordlog).sendKeys(password);

	
}

  
	public void login() {
	driver1.findElement(loginbtn).click();
		
	}
	
	
	
}

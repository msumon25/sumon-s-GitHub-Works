package exampleCodes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testWebDriver {

	public static void main(String[] args) {
		
		//I want to open a Chrome Driver
		//System.setProperty("webdriver.chrome.driver", "");
		WebDriverManager.chromedriver().setup(); 
		WebDriver mydriver;
		boolean result;

		//***** Test Logo ***** 


		// this will not require setProperty. Used from https://github.com/bonigarcia/webdrivermanager
		mydriver = new ChromeDriver();

		//Go to NMKDhaka website application
		mydriver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

		//view company Logo 
		String logoxpath = "//img[@class='img-responsive']";

		try { 
			result = mydriver.findElement(By.xpath(logoxpath)).isDisplayed(); 
		}
		catch(Exception e) { 
			result = false; //this will show why your code is failed
			System.out.println(e.getMessage()); 
		}

		if (result == true) { 
			System.out.println("Logo Element Exist - Passed"); 
		}
		else { 
			System.out.println("Logo Element Exist - Failed"); 
		}
		
		
		


	//***** Test Login ***** 
		  
		  mydriver = new ChromeDriver();

		  //Go to NMKDhaka website application
		  mydriver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

		  //Click the Login Link
		  String Loginxpath = "//span[contains(text(),'Login')]";
		  mydriver.findElement(By.xpath(Loginxpath)).click();

		  //Enter ID
		  String UserNamexpath = "//input[@id='username']";
		  mydriver.findElement(By.xpath(UserNamexpath)).sendKeys("user");


		  //Enter Password 
		  String Passwordxpath = "//input[@id='password']";
		  mydriver.findElement(By.xpath(Passwordxpath)).sendKeys("pass");


		  //Click Login Button 
		  String LoginButtonxpath = "//button[@id='jqLogin']";
		  mydriver.findElement(By.xpath(LoginButtonxpath)).click();

		  //Then I validate I am Logged-In or Check my First Name and Last Name top right corner of the home page 
		  String myProfileName = "//span[contains(text(),'James williams')]";

		  try {
			  result = mydriver.findElement(By.xpath(myProfileName)).isDisplayed();
		  }

		  catch (Exception e){
			  result = false;
			  System.out.println(e.getMessage());
		  }

		  if (result == true) {
			  System.out.println("Profile Icon with Name Exist - Passed");
		  }
		  else {
			  System.out.println("Profile Icon with Name Does Not Exist - Failed");
		  }
		
	//***** Test Login ***** 
		
		  mydriver = new ChromeDriver();

		  //Go to NMKDhaka website application
		  mydriver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

		  //Click the Login Link
		  String LoginXpath = "//span[contains(text(),'Login')]";
		  mydriver.findElement(By.xpath(LoginXpath)).click();

		  //Enter ID
		  String SignUp = "//button[@id='jqSignup']";
		  mydriver.findElement(By.xpath(SignUp)).click();

		  //Enter Your Email 
		  String txtEmail = "//input[@id='txtEmail']";
		  mydriver.findElement(By.xpath(txtEmail)).sendKeys("Munny_Ahmed@gmail.com");

		  //Enter User Name
		  String txtUserName = "//input[@id='txtUserName']";
		  mydriver.findElement(By.xpath(txtUserName)).sendKeys("Munny123");

		  //Enter Password 
		  String txtPassword = "//input[@id='txtPassword']";
		  mydriver.findElement(By.xpath(txtPassword)).sendKeys("sam123");

		  //Enter Confirm Password
		  String txtCnfPassword = "//input[@id='txtCnfPassword']";
		  mydriver.findElement(By.xpath(txtCnfPassword)).sendKeys("sam123");

		  //Enter First Name
		  String txtFirstName = "//input[@id='txtFirstName']";
		  mydriver.findElement(By.xpath(txtFirstName)).sendKeys("Ahmed");

		  //Enter Last Name
		  String txtLastName = "//input[@id='txtLastName']";
		  mydriver.findElement(By.xpath(txtLastName)).sendKeys("Munny");

		  //Enter Address
		  String Address = "//input[@placeholder='Address *']";
		  mydriver.findElement(By.xpath(Address)).sendKeys("397 Autumn Ave. Brooklyn NY 11989");

		  //Disable check box
		  String check_news = "//input[@name='check_news']";
		  mydriver.findElement(By.xpath(check_news)).isEnabled();


		  //***Closing Statment****

		  System.out.println("Test Complete"); 
		  mydriver.close();

	}

}

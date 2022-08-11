package com.myweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mywebTest {

	@Test
	public static void Test1() {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dmasu\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	        
		   WebDriver driver = new ChromeDriver();
		   
	        driver.get("http://www.google.com");
	        System.out.println("browser opened");
		
	}

}

package org.sel;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	        public static void main(String[] args) throws IOException, InterruptedException {
				
	        	System.setProperty("webdriver.chrome.driver",
	        			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	        	
	        	WebDriver driver = new ChromeDriver();
	        	
	        	driver.get("http://greenstech.in/selenium-course-content.html");
	        	   
	            JavascriptExecutor js = (JavascriptExecutor)driver;
	        	  
	            WebElement txtscroll = driver.findElement(By.xpath("//span[@class='feature-title']"));
	        	  
	        	  js.executeScript("arguments[0].scrollIntoView(true)", txtscroll);
	        	  
	        	  Thread.sleep(3000);
	        	  WebElement btnclick = driver.findElement(By.xpath
	        			  ("//i[@class='fas fa-plus']"));
	        	  btnclick.click();
	        	  
	        	  TakesScreenshot tk = (TakesScreenshot)driver;
	        	  
	        	  File src = tk.getScreenshotAs(OutputType.FILE);
	        	  System.out.println(src);
	        	  
	        	  File desc = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\third.png");
	        	  FileUtils.copyFile(src, desc);
	        	  System.out.println("aravind");
	        	  
	  
					}
						
					}
				
	        	 
	        	 
	        	 
	        
					
					
	        		
	        	
	        	

					
				
			
	        	
	        	
	        	
			



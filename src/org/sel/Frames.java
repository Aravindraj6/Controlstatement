package org.sel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Frames {
	
	
	  public static void main(String[] args) {
			
      	System.setProperty("webdriver.chrome.driver",
      			"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
      	
      	WebDriver driver = new ChromeDriver();
      	
      	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
      	
      	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
      	
      	for (int i = 0; i < tRows.size(); i++) {
      		
      		WebElement trow = tRows.get(i);
      		
      	}
      	List<WebElement> tdatas = driver.findElements(By.tagName("td"));
      			        		
      			   for (int j = 0; j < tdatas.size(); j++) {
      				WebElement tdata = tdatas.get(j);
      				String text = tdata.getText();
      				System.out.println(text);

				
			}
			}
      	
      	
	
	

}

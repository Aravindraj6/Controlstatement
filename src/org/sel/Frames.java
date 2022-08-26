package org.sel;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	
	  public static void main(String[] args) throws InterruptedException, IOException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
          List<WebElement> allLinks = driver.findElements(By.tagName("a"));
          
          int s = allLinks.size();
          System.out.println(s);
          
          for (WebElement link : allLinks) {
			String  at= link.getAttribute("href");
			System.out.println(at);
			
			if (at != null) {
				URL u = new URL(at);
				URLConnection op = u.openConnection();
				HttpsURLConnection hp = (HttpsURLConnection)op;
				
				int code = hp.getResponseCode();
				if (code >=400) {
					System.out.println(at);
				}
			}
		}
		
		
	}

}

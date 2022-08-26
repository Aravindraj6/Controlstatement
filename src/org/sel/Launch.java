package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	      
	      public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			
			WebElement txtsearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
			txtsearch.sendKeys("iphone 13");
			
			Thread.sleep(3000);
			WebElement btnclick = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			btnclick.click();
			
			Thread.sleep(3000);

			WebElement btniphone = driver.findElement(By.xpath("(//div[text()='APPLE iPhone 13 (Green, 128 GB)'])"));
			btniphone.click();
			
			String par = driver.getWindowHandle();
			System.out.println(par);
			
			Set<String> All = driver.getWindowHandles();
			System.out.println(All);
			
			for (String x : All) {
				if (!par.equals(x)) {
					driver.switchTo().window(x);
				}
			}
			Thread.sleep(3000);

			WebElement btnaddtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
			btnaddtocart.click();
			
			driver.switchTo().window(par);
			
			WebElement phone2 = driver.findElement(By.xpath("(//div[text()='APPLE iPhone 13 (Blue, 128 GB)'])"));
			phone2.click();
			
			Set<String> All2 = driver.getWindowHandles();
			System.out.println(All2);
			
			int Count=0;
			for (String y : All2) {
				if (Count==2) {
					
					driver.switchTo().window(y);
					
				}
				Thread.sleep(5000);

				WebElement btnaddtocart2 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
				btnaddtocart2.click();
				
			}
			

			
		}

}

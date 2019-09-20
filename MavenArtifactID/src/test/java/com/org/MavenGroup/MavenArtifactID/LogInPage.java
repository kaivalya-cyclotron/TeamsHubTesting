package com.org.MavenGroup.MavenArtifactID;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {
	
	

	@Test
	public void TC1_Login()
	//public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://teamswebstaging.azurewebsites.net");
		
		driver.manage().window().maximize();
	
			
			driver.findElement(By.id("i0116")).sendKeys("kaivalya@cyclotrondev.com");
			driver.findElement(By.id("idSIButton9")).click();
		
		
			driver.findElement(By.id("i0118")).sendKeys("Metro@may");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("idSIButton9")).click();
		
	
			driver.findElement(By.id("idSIButton9")).click();
			//System.out.println("pwd typed");
		
			// test
			String actualTitle = driver.getTitle();
			 
			 String expectedTitle = "Teams Hub";
			 if(actualTitle.equalsIgnoreCase(expectedTitle))
			 System.out.println("Title Matched - Test Case Passed");
			 else
			 System.out.println("Title didn't match - Test Case Failed");
				System.out.println("Title didn't match - Test Case Failed");
	
	}
		
}


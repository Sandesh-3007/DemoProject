package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoClass 
{
@Test
public void RecieveData() 
{
	String URL = System.getProperty("url");
	System.out.println(URL);
	System.out.println("Sample test");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
}
}

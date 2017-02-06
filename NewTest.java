package firsttestngpackge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe"); 
	   WebDriver d = new ChromeDriver();
	   d.get("http://www.rblbank.com/FdCalc.aspx");
	   WebElement a = d.findElement(By.id("currentval"));
	   a.clear();
	   a.sendKeys("200000");
	   a.click();
	      WebElement b = d.findElement(By.className("applicant-form"));
	      b.clear();
	      b.sendKeys("12");
	      b.click();
	      d.findElement(By.id("btnCalculate")).click();
	      WebElement c = d.findElement(By.id("dvMaturityValue"));
  }
}

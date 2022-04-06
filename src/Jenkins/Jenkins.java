package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkins {
	static WebDriver driver;
  @Test
  public void Test() {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
  }
}

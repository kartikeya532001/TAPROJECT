package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoft {
	static WebDriver driver;

	@BeforeTest
	public void beforeCheck() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		System.out.println();
	}

	@Test
	public void f() {
		driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/form/input"))
				.sendKeys("rcb");
		driver.findElement(By.partialLinkText("PUMA x Royal Challengers Bangalore Replica Men's 2022 Jersey")).click();
		SoftAssert softassert = new SoftAssert();
		WebElement aT = driver
				.findElement(By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[1]/div[1]/h1"));
		String At = aT.getText();
		String Et = "PUMA x Royal Challengers Bangalore Replica Men's 2022 Jersey";
		softassert.assertEquals(At, Et);
		WebElement p = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div/div/div[1]/div/span/span"));
		boolean pc = p.isDisplayed();
		softassert.assertEquals(pc, true);
		WebElement img = driver.findElement(By.xpath(
				"/html/body/div[4]/div[3]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div[3]/a/picture/img"));
		boolean imgc = img.isDisplayed();
		softassert.assertEquals(imgc, true);
		WebElement s = driver
				.findElement(By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[7]/div[2]/div/h6"));
		boolean sc = s.isDisplayed();
		softassert.assertEquals(sc, true);
		WebElement b = driver
				.findElement(By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[10]/div/div[2]/button"));
		boolean bc = b.isEnabled();
		softassert.assertEquals(bc, true);
		WebElement f = driver.findElement(
				By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[10]/div/div[3]/div/button"));
		boolean fc = f.isEnabled();
		softassert.assertEquals(fc, true);
		WebElement q = driver.findElement(By.xpath(
				"/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[10]/div/div[1]/div/div[1]/div[1]/select"));
		boolean qc = q.isEnabled();
		softassert.assertEquals(qc, true);
	}
}

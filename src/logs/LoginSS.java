package logs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSS {
	public static void main(String[] args){
		BaseTest.setUpBrowser();		
		WebDriver driver = BaseTest.generateTest();		
		
		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/div/div[3]/a"))
				.click();
		driver.findElement(By.id("login-form-email")).sendKeys("500078285@stu.upes.ac.in"); // Write email in the text field
		driver.findElement(By.id("login-form-password")).sendKeys("Khanna@5301"); // Write password in the text field
		driver.findElement(By.partialLinkText("Login")).click();
		BaseTest.captureScreenshort(driver);					
		BaseTest.tearDown(driver);
	}
}

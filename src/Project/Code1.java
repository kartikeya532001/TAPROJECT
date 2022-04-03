// 1.This is code for is for testing the login and signup function.
// 2.In this code i have used priority in different test methods.
// 3. I had used dataproviders to provide user details for login and signup.
// 4. .click() function is used to click a particular section.
// 5. .sendkeys is used to for sending the user details 
// 6. beforemethod and aftermethod annontations are used in this code.
// 7. two files which will provide data are Login.java and SignupData.java

package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Code1 {
	WebDriver driver;

	@BeforeTest
	public void beforeLogin() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");

	}

	@BeforeMethod
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
	}

	@Test(dataProviderClass = SignupData.class, dataProvider = "Signup", priority = 0)
	public void signup(String fname, String lname, String email, String pass) {

		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/div/div[3]/div/a")).click();
		driver.findElement(
				By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div/div/div/div[2]/form/div[1]/div[1]/input"))
				.sendKeys(fname); // Write fisrtName in the text field
		driver.findElement(
				By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div/div/div/div[2]/form/div[2]/div[1]/input"))
				.sendKeys(lname); // Write lastName in the text field
		driver.findElement(
				By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div/div/div/div[2]/form/div[3]/div[1]/input"))
				.sendKeys(email); // Write email in the text field
		driver.findElement(
				By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div/div/div/div[2]/form/div[4]/div[1]/input"))
				.sendKeys(pass); // Write password in the text field
		// driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div/div/div/div[2]/form/div[5]/button")).click();
	}

	@Test(dataProviderClass = Login.class, dataProvider = "login", priority = 1)
	public void login(String email, String pass) {

		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/div/div[3]/a"))
				.click();
		driver.findElement(By.id("login-form-email")).sendKeys(email); // Write email in the text field
		driver.findElement(By.id("login-form-password")).sendKeys(pass); // Write password in the text field
		// driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/div[1]/div/div/div/div/div[1]/form/div[5]/button")).click();
	}

	@AfterMethod
	public void afterTest() {
		driver.close();
	}
}

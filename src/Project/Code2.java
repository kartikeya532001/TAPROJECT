// 1.This is code for is for testing the home page.
// 2.In this code i have used priority in different test methods.
// 3.In this code i had check that a particular button is clickable or not by the help of .isEnabled function
// 4.In this code i had checked that a particular text is or section is displayed with the help of .isDisplayed function.
// 5.In this code i had also check that a particular text is displayed correctly with the of partial link text and then 
//   checked it with .getText and .contains.
// 6. beforetest and aftertest annontations are used in this code.

package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Code2 {
	WebDriver driver;

	@BeforeTest
	public void beforeCheck() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		System.out.println("Testing of Home Page...");
		System.out.println();
	}

	@Test (priority=0)
	public void NavBarCheck() {
		System.out.println("Navigation Bar Check");
		WebElement logo = driver
				.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[1]/a/span[2]"));
		boolean l = logo.isDisplayed();
		WebElement nA = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[1]/a/span"));
		boolean na = nA.isDisplayed(); // for diplay check
		WebElement W = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[2]/a/span"));
		boolean Wo = W.isDisplayed();
		WebElement M = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[3]/a/span"));
		boolean m = M.isDisplayed();
		WebElement K = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[4]/a/span"));
		boolean k = K.isDisplayed();
		WebElement C = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[5]/a/span"));
		boolean c = C.isDisplayed();
		WebElement S = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[6]/a/span"));
		boolean s = S.isDisplayed();
		WebElement O = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[1]/div[2]/nav/ul/li[7]/a/span"));
		boolean o = O.isDisplayed();
		WebElement sB = driver.findElement(
				By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/form/input"));
		boolean sb = sB.isDisplayed();
		WebElement F = driver
				.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[2]/div/a"));
		boolean f = F.isDisplayed();
		WebElement vC = driver
				.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[3]/div/a"));
		boolean vc = vC.isDisplayed();
		WebElement OL = driver
				.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/a/span"));
		boolean ol = OL.isDisplayed();
		System.out.println("Logo Displayed: " + l);
		if (na == true && Wo == true && m == true && k == true && c == true && s == true && o == true)
			System.out.println("List Displayed: true");
		else
			System.out.println("List Displayed: false");
		System.out.println("Search Bar Displayed: " + sb);
		System.out.println("Favorites Displayed: " + f);
		System.out.println("View Carts Displayed: " + vc);
		System.out.println("QuickLinks Displayed: " + ol);
		System.out.println();
	}

	@Test (priority=1)
	public void HomePageCheck() {
		System.out.println("Home Page Check");
		WebElement SaleImg = driver
				.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div/section/div/div[1]/a/picture/img"));
		boolean si = SaleImg.isDisplayed();
		WebElement button = driver
				.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div/section/div/div[2]/div/div[3]/a"));
		boolean b = button.isEnabled(); // for clickable check
		WebElement Text = driver
				.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div/section/div/div[2]/div/div[1]/span[1]"));
		boolean t = Text.isDisplayed();
		System.out.println("Image Displayed: " + si);
		System.out.println("Button Displayed and Enabled: " + b);
		System.out.println("Text Displayed: " + t);
		System.out.println();
	}

	@Test (priority=2)
	public void CardCheck() {
		System.out.println("Card Check");
		WebElement ProImg = driver.findElement(
				By.xpath("/html/body/div[4]/div[2]/div/div/div/div/div[1]/div/div[1]/a/div[1]/picture/img"));
		boolean pi = ProImg.isEnabled();
		WebElement ptext = driver
				.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/div[1]/div/div[1]/a/div[2]/h3"));
		boolean pt = ptext.getText().contains("PUMA x Royal Challengers Bangalore Replica Men's 2022 Jersey"); // to check if text is dsiplayed properly
		boolean pt1 = ptext.isEnabled();
		WebElement price = driver
				.findElement(By.xpath("	/html/body/div[4]/div[2]/div/div/div/div/div[1]/div/div[1]/a/div[2]/div/div	"));
		boolean p = price.getText().contains("1999");
		boolean p1 = price.isEnabled();
		System.out.println("Image Displayed and Clickable: " + pi);
		if (pt == true && pt1 == true) {
			System.out.println("Text is Displayed and Clickable: true");
		} else
			System.out.println("Text is Displayed and Clickable: false");
		if (p == true && p1 == true)
			System.out.println("Price is Displayed and Clickable: true");
		else
			System.out.println("Price is Displayed and Clickable: false");
		System.out.println();
	}

	@Test (priority=3)
	public void FooterCheck() {
		System.out.println("Footer Check");
		WebElement supportS = driver
				.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[1]/div[1]/div/div[1]/span[1]"));
		boolean s= supportS.isDisplayed();
		WebElement aboutP= driver.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[1]/div[2]/div/div[1]/span[1]"));
		boolean ap= aboutP.isDisplayed();
		WebElement logoF = driver.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[2]/div/a/img"));
		boolean logof = logoF.isDisplayed();
		WebElement logoFB = driver
				.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[2]/div/div[2]/a[1]"));
		boolean fb= logoFB.isEnabled();
		WebElement logoT= driver.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[2]/div/div[2]/a[2]"));
		boolean lt= logoT.isEnabled();
		WebElement logoI = driver.findElement(By.xpath("//html/body/div[4]/footer/div/div/div[2]/div/div[2]/a[3]"));
		boolean li = logoI.isEnabled();
		WebElement logoP = driver
				.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[2]/div/div[2]/a[4]"));
		boolean p= logoP.isEnabled();
		WebElement logoY= driver.findElement(By.xpath("/html/body/div[4]/footer/div/div/div[2]/div/div[2]/a[5]"));
		boolean y= logoY.isEnabled();
		WebElement text = driver.findElement(By.xpath("/html/body/div[4]/div[8]/div/div/div[1]/div[2]"));
		boolean texT = text.isDisplayed();
		WebElement Box = driver.findElement(By.xpath("/html/body/div[4]/div[8]/div/div/div[1]/div[1]/a"));
		boolean box = Box.isDisplayed();
		System.out.println("Support Section Displayed: "+s);
		System.out.println("About Section Displayed: "+ap);
		System.out.println("Logo Displayed: "+logof);
		System.out.println("FaceBook Button Displayed and Active: "+fb);
		System.out.println("Twitter Button Displayed and Active: "+lt);
		System.out.println("Instagram Button Displayed and Active: "+li);
		System.out.println("Pinterest Button Displayed and Active: "+p);
		System.out.println("Youtube Button Displayed and Active: "+y);
		System.out.println("CopyRight Text Displayed: "+texT);
		System.out.println("Language Box Displayed: "+box);
		System.out.println();
	}
	  
	@AfterTest
	public void afterCheck() {
		System.out.println("Testing of Home Page Completed...");
		driver.close();
	}
}

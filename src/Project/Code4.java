// In this Code we have tested login system using Excel File reader.
package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code4 {

	public static void main(String[] args)  throws IOException
	{
	
		String username = "";
		String Password = "";
		
		try 
		{
			FileInputStream file = new FileInputStream("E:\\Java\\TestAntomationProject\\Data.xlsx");
			try (XSSFWorkbook wb = new XSSFWorkbook(file)) 
			{
				XSSFSheet sheet = wb.getSheet("Sheet1");
				
				int rowCount = sheet.getLastRowNum();
				
				for(int i = 1; i <= rowCount; i++)
				{
					XSSFRow row = sheet.getRow(i);
					
					if(row.getCell(0).getCellType() == CellType.NUMERIC)
					{
						username = row.getCell(0).getRawValue();
					}
					else
					{
						username = row.getCell(0).toString();
					}
					
					if(row.getCell(1).getCellType() == CellType.NUMERIC)
					{
						Password = row.getCell(1).getRawValue();
					}
					else
					{
						Password = row.getCell(1).toString();
					}
										
					login(username, Password);
				}
			}
			
			file.close();
		} 
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login(String email, String pass)
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\UPES\\SEM 6\\Lab\\Test Automation\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[4]/header/div[1]/div/div[2]/div/div[2]/div/div[4]/div/div[3]/a"))
				.click();
		driver.findElement(By.id("login-form-email")).sendKeys(email); // Write email in the text field
		driver.findElement(By.id("login-form-password")).sendKeys(pass); // Write password in the text field
		driver.findElement(By.partialLinkText("Login")).click();
		System.out.println("\n Username: " + email + "\n Password: " + pass);
		driver.close();
		
		
	}

}

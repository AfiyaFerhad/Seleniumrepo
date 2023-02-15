package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args)
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HYBE");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Afiya ");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ferhad");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aafi");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("afiyaferhadaabi@gmail.com");

		WebElement parent = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd=new Select(parent);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Software Testing");
		driver.findElement(By.xpath("(//td/input[@class='smallSubmit'])[1]")).click();

		String title = driver.getTitle();		
		System.out.println(title);
//		driver.close();

	}

}

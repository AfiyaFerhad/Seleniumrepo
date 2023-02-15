package week2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//a[@class='subMenuButton'][1]")).click();
		WebElement parent1=driver.findElement(By.id("createLeadForm_companyName"));
		parent1.clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Pledis");
		WebElement parent11=driver.findElement(By.id("createLeadForm_firstName"));
		parent11.clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aafy");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
//		driver.close();
	}

}
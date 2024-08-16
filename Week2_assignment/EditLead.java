package Week2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("New Company");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("NDS3");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Anand");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("MDU");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("No comments");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Anand@gmail.com");
		WebElement st = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select opt1 =new Select(st);
		opt1.selectByVisibleText("Indiana");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("No important");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.close();
	}

}

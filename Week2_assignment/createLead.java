package Week2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead {

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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anand");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Satyanarayanan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Dreams");
		driver.findElement(By.name("generalProfTitle")).sendKeys("QA");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.close();
		
		
	}

}

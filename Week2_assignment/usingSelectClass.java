package Week2_assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class usingSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Madurai 06");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement ab = driver.findElement(By.name("industryEnumId"));
		Select opt =new Select(ab);
		opt.selectByVisibleText("Computer Software");
		WebElement cd = driver.findElement(By.name("ownershipEnumId"));
		Select opt1 =new Select(cd);
		opt1.selectByVisibleText("S-Corporation");
		WebElement ef = driver.findElement(By.name("dataSourceId"));
		Select opt2 =new Select(ef);
		opt2.selectByValue("LEAD_EMPLOYEE");
		WebElement gh = driver.findElement(By.name("marketingCampaignId"));
		Select opt3 =new Select(gh);
		opt3.selectByIndex(6);
		WebElement ij = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt4 =new Select(ij);
		opt4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement kl = driver.findElement(By.xpath("//span[@id='ext-gen1166']"));
		String text = kl.getText();
		System.out.println(text);
		//driver.close();
	}

}







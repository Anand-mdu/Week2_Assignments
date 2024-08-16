package Week2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("MSD");
		driver.findElement(By.name("lastname")).sendKeys("Madurai@0707");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12303958");
		WebElement day = driver.findElement(By.id("day"));
		Select opj1=new Select(day);
		opj1.selectByValue("11");
		WebElement month = driver.findElement(By.id("month"));
		Select opj2=new Select(month);
		opj2.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select opj3=new Select(year);
		opj3.selectByValue("1996");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

}
	
}

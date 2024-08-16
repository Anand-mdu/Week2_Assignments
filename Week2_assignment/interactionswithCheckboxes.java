package Week2_assignment;

import java.time.Duration;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interactionswithCheckboxes {

	private static final String ContainsText = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		boolean cb = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).isDisplayed();
		System.out.println(cb);
		if (cb==true) {
			System.out.println("Expected message is displayed");
		}
		else {
			System.out.println("Expected message isnot  displayed");
		}
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).click();

		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		boolean tri = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).isDisplayed();
		System.out.println(tri);
		if (tri == true) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not Verified");
		}

		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean tg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).isDisplayed();		
		System.out.println(tg);
		if (cb==true) {
			System.out.println("Expected message is displayed");
		}
		else {
			System.out.println("Expected message is not  displayed");
		}


		WebElement bt = driver.findElement(By.id("j_idt87:j_idt102"));
		if (bt.isSelected() ) { 
			System.out.println("button is enabled.");
		}
		else {
			System.out.println("button is disabled.");
		} 

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();

		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[10]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[12]")).click();

		//driver.close();
	}

}










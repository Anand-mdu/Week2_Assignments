package Week2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;

public class interactionWithButtons {
	
	public static void main(String[] args) {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.leafground.com/button.xhtml"); 
		Driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click(); 
		Driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb']"));
		String dash = Driver.getTitle();
		System.out.println(dash);
		if (dash.equals("Dashboard")) {
		System.out.println("Title is Verified");
		}
		else {
		System.out.println("Title is not verified");
		}
		Driver.navigate().back();
		WebElement ds = Driver.findElement(By.xpath("(//div[@class='card'])[2]"));
		if (ds.isSelected() ) {
		System.out.println("button is enabled.");
		}
		else {
		System.out.println("button is disabled.");
		}
		//Find the position of the Submit button     
		WebElement Loc = Driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		org.openqa.selenium.Point Position = Loc.getLocation();
		System.out.println("Position of the button is" + Position);
		
		//Find the Save button color     
		WebElement colour = Driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		String ab = colour.getCssValue("color");
		System.out.println("Color is :" + ab);


		//Find the height and width of this button      
		WebElement hw = Driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
		 Dimension size = hw.getSize();
		 System.out.println("height and Width is:" +size);

		Driver.close();
		}


}

package week4.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleActionTable {

	public static void main(String[] args) {
		//draggable
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//switching to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("X location is :"+x+" Y location is : "+y);
		//Instantiating action class
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 50, 250).perform();
				
		
		/*
		
		Assignment Based on Action Class
		================================

		https://jqueryui.com/draggable
		https://jqueryui.com/droppable
		https://jqueryui.com/resizable
		https://jqueryui.com/selectable
	*/
	}

}

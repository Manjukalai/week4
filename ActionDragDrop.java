package week4.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(drag).moveByOffset(60, 120).perform();
		
		
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drop']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='form:drag']"));
		//Actions dragDrop = new Actions(driver);
		
		builder.dragAndDrop(target, source).perform();
		//column drag and drop
		WebElement tableDragColm = driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table"));
		WebElement src = driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table//th[3]"));
		WebElement tar = driver.findElement(By.xpath("//div[@class='ui-datatable-tablewrapper']/table//th[2]"));
		builder.dragAndDrop(src, tar).perform();
		/*//row drag and drrop
		WebElement row1 = driver.findElement(By.xpath("(//tr[@class='ui-widget-content ui-datatable-odd'])[6]"));
		WebElement row2 = driver.findElement(By.xpath("(//tr[@class='ui-widget-content ui-datatable-even'])[10]"));
		builder.clickAndHold(row1).moveToElement(row2).perform();//not performed
	*/
		
		WebElement img = driver.findElement(By.xpath("//img[@id='form:logo']"));
		Point location = img.getLocation();
		int x = location.getX();
		int y = location.getY();
		WebElement yHandle = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		WebElement xHandle = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));
		builder.clickAndHold(yHandle).moveToLocation(500, 300).perform();
		builder.clickAndHold(xHandle).moveByOffset(25, 60).perform();
		
		WebElement dot1 = driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default"));
		WebElement dot2 = driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default"));
		builder.dragAndDrop(dot1, dot2).perform();//not working
	
	
	
	
	
	
	}

}

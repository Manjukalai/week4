package week4.assign;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.messages.types.ParseError;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("(//span[@class='catText'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		
		//shoes count
		String shoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String count = shoesCount.replaceAll("[^0-9]","");
		System.out.println("Shoes count is : "+count);
		
		//click on training shoes
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		//sort
		Actions builder = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		
		builder.dragAndDropBy(drag, 100, 0).perform();
		
		//click navy clolor
		//driver.findElement(By.xpath("( //a[@class='filter-name'])[5]")).click();
		Thread.sleep(3000);
		//mouse hover first product
		WebElement mouseHover = driver.findElement(By.xpath("//p[text()='Vector X RAZOR 2.0 Red Training Shoes']"));
		builder.moveToElement(mouseHover).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		
		
		//Set<String> win = driver.getWindowHandles();
		//List<String> winList = new ArrayList<String>(win);
		//driver.switchTo().window(winList.get(1));
		//print cost and discount
		String cost = driver.findElement(By.xpath("//span[@class=\"payBlkBig\"]")).getText();
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("cost is "+cost+" discount is "+discount);
		//screenshot
		Thread.sleep(5000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/snapdeal.jpg");
		FileUtils.copyFile(source, des);
		driver.close();
		
		
		/*
		SnapDeal Assignment
		=========================
		1. Launch https://www.snapdeal.com/
		2. Go to Mens Fashion
		3. Go to Sports Shoes
		4. Get the count of the sports shoes
		5. Click Training shoes
		6. Sort by Low to High
		7. Check if the items displayed are sorted correctly
		8.Select the price range (900-1200)
		9.Filter with color Navy 
		10 verify the all applied filters 
		11. Mouse Hover on first resulting Training shoes
		12. click QuickView button
		13. Print the cost and the discount percentage
		14. Take the snapshot of the shoes.
		15. Close the current window
		16. Close the main window
	*/
	
	
	
	
	
	
	}

}

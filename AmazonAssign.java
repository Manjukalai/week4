package week4.assign;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonAssign {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		//String text = driver.findElement(By.xpath("//span[text()='56,999']")).getText();
		//System.out.println(text);
		//String ratings = driver.findElement(By.xpath("//span[text()='4,436']")).getText();
		//System.out.println(ratings);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//moving to new opened window
		Set<String> win1 = driver.getWindowHandles();
		List<String> winLst = new ArrayList<String>(win1);
		
		driver.switchTo().window(winLst.get(1));
		Thread.sleep(6000);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/amazon.jpg");
		FileUtils.copyFile(source, target);//doesnt work
		/*

		3.Get the price of the first product
		4. Print the number of customer ratings for the first displayed product
		5. Click the first text link of the first image
		6. Take a screen shot of the product displayed
		7. Click 'Add to Cart' button
		8. Get the cart subtotal and verify if it is correct.
		9.close the browser
	
	*/
	
	
	}

}

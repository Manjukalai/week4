package week4.assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));

		driver.get("https://www.nykaa.com/");
		//mouse hover
		WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		//click loreal paris
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click();
		
		//String title = driver.getTitle();
			//System.out.println(title);
			//customer top rated
			driver.findElement(By.className("sort-name")).click();
			driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		//click catagory
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
			Thread.sleep(3000);
			//click concern then color protection
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			
			driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[3]")).click();
			
			WebElement checkShampoo = driver.findElement(By.xpath("//span[@class='filter-value']"));
			String text = checkShampoo.getText();
			if(text.equalsIgnoreCase("shampoo"))
			{
				System.out.println("shompoo got selected");
			}
			else 
			{
				System.out.println("shampoo not selected");
			}
			//click loreal
			driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[1]")).click();
			
			Set<String> window = driver.getWindowHandles();
			List<String> win = new ArrayList<String>(window);
			driver.switchTo().window(win.get(1));
			//click 180ml
			//driver.findElement(By.xpath("//span[text()='180ml']")).click();
			//mrp 
			String mrp = driver.findElement(By.xpath("//span[text()='₹1328']")).getText();
			//String mrpRate = mrp.replaceAll("[^0-9a-zA-Z", "");
			System.out.println(mrp);
			
			driver.findElement(By.xpath("//span[@class='btn-text']")).click();
			
			//click shopping bag
			driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
			
			driver.switchTo().frame(0);
			//prind grand total
			String grandTotal = driver.findElement(By.xpath("(//p[text()='₹1328'])[2]")).getText();
			System.out.println(grandTotal+"grand total");
			//proceed button
			driver.findElement(By.xpath("//span[text()='Proceed']")).click();
			//as guest
			driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
			
			//total
			String total = driver.findElement(By.xpath("(//p[text()='₹1328'])[2]")).getText();
			if(total.equalsIgnoreCase(grandTotal))
			{
				System.out.println("same amount");
			}
			else
			{
				System.out.println("not same amount");
			}
			for (String string : window) {
				driver.switchTo().window(string);
				driver.close();
				
			}
			
		/*
		
		16) Click on Continue as Guest
		17) Check if this grand total is the same in step 14
		18) Close all windows
	
	*/
	
	
	
	
	
	
	
	
	}

}

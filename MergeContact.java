package week4.assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		
		//click contact
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//click merge contact
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//1st widget
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		
		//switch to window
		Set<String> win1 = driver.getWindowHandles();
		List<String> winLst = new ArrayList<String>(win1);
		
		driver.switchTo().window(winLst.get(1));
		//table
		
		Thread.sleep(3000);
		//WebElement table = driver.findElement(By.xpath("//div[@class='x-panel-body xedit-grid']"));
		//WebElement row = driver.findElement(By.tagName("tr"));
		//WebElement column = driver.findElement(By.tagName("td"));
		
		//Dimension rowSize = row.getSize();
		//Dimension columnSize = column.getSize();
		
		//System.out.println(rowSize+" "+columnSize);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//driver.close();
		driver.switchTo().window(winLst.get(0));//parent window		
		
		//2nd widget
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		Set<String> win2 = driver.getWindowHandles();
		List<String> winLst2 = new ArrayList<String>(win2);
		
		driver.switchTo().window(winLst2.get(1));
		//WebElement table2 = driver.findElement(By.xpath("//div[@class='x-panel x-grid-panel']"));
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//driver.close();
		driver.switchTo().window(winLst.get(0));
		
		//click submit
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		
		
		
		

		
		
				/*
				 
				 * 6. Click on Merge Contacts using Xpath Locator
				 * 
				 * 7. Click on Widget of From Contact
				 * 
				 * 8. Click on First Resulting Contact
				 * 
				 * 9. Click on Widget of To Contact
				 * 
				 * 10. Click on Second Resulting Contact
				 * 
				 * 11. Click on Merge button using Xpath Locator
				 * 
				 * 12. Accept the Alert
				 * 
				 * 13. Verify the title of the page
				 */
			
	}

}

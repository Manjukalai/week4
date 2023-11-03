package week4.assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandles {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		/*
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
		Set<String> winHandles = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(winHandles);
		int size = win.size();
		for( int i=0; i<=size-1;i++)
		{
			if(size-1>=1)
			{
				System.out.println("A new window is opened");
			}
			
		}
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right ui-button-warning']")).click();
		Set<String> WinHandles1 = driver.getWindowHandles();
		List<String> WinLst = new ArrayList<String>(WinHandles1);
		for(int i=1;i<=WinLst.size()-1;i++)
		{
		driver.switchTo().window(WinLst.get(i));
		driver.close();
		}
		
		driver.switchTo().window(WinLst.get(0));
		

		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> WinHandles2 = driver.getWindowHandles();
		int size = WinHandles2.size();
		List<String> WinLst1 = new ArrayList<String>(WinHandles2);
		System.out.println("No of windows opened is "+size);
		*/
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		Thread.sleep(5000);

		Set<String> WinHand = driver.getWindowHandles();
		List<String> WinHandLst = new ArrayList<String>(WinHand);
		driver.switchTo().window(WinHandLst.get(0));//parent window
		
		
	}

}

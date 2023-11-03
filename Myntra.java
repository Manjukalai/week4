package week4.assign;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));

		driver.get("https://www.myntra.com/");
		
		Actions builder = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[1]"));
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[@href='/men-jackets']")).click();
		
		//title count
		Thread.sleep(3000);
		WebElement titleCount = driver.findElement(By.xpath("//span[@class='title-count']"));
		String count = titleCount.getText();
		int number = Integer.parseInt(count.replaceAll("[^0-9]", ""));
		System.out.println(number);
		
		//validate sum categories 
		List<WebElement> jacketsName= driver.findElements(By.xpath("//ul[@class='categories-list']//label"));
		for (WebElement i : jacketsName) {
		System.out.println(i.getText());
		}
		//individual count
		int total=0;
		for(int i=1;i<=jacketsName.size();i++)
		{
		List<WebElement> jacketCount= driver.findElements(By.xpath("//ul[@class='categories-list']//label[\"+i+\"]/span"));
		
		for (WebElement countValue : jacketCount) {
			String text = countValue.getText();
			int cnt = Integer.parseInt(text.replaceAll("[^0-9a-zA-Z]", ""));
		total = total + cnt;
			
		}
		System.out.println(total+" the individual count");

		}
		if(number==total)
		{
			System.out.println("Both count is same");
		}
		else
		{
			System.out.println("not equal");
		}
		//check jacket
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		//+ more click
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		//type duke 
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("duke",Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Duke']")).click();
		//close pop up x
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		//all duke lst
		List<WebElement> dukeList = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		Set<String> set = new LinkedHashSet<String>();
		for(int i=1;i<=dukeList.size();i++)
		{
			String dukeList1 = driver.findElement(By.xpath("//div[@class='product-productMetaInfo']/h3["+i+"]")).getText();
			set.add(dukeList1);
			System.out.println(set);
		}
				//better discount
		driver.findElement(By.xpath("(//div[@class='common-radioIndicator'])[8]")).click();
		//price of 1st item
		String price = driver.findElement(By.xpath("(//span[text()='1319'])[1]")).getText();
		System.out.println(price);
		
		File sorce = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/myntra.png");
		FileUtils.copyFile(source, target);
		//click on wishlist
		driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[2]")).click();
		driver.close();
		
			}

}

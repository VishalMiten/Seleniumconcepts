package webtable;

import java.util.List;
import java.util.Set;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamicwebtable {
	
	public static int i;
	public static int row1=1;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		
		
		//options.addArguments("start");
		options.addArguments("disable-popup-blocking");
		options.addArguments("--headless");
		options.addArguments("--start-maximized");
		//options.addArguments("--no-startup-window");
        WebDriver driver = new ChromeDriver(options);
        
        JavascriptExecutor js = (JavascriptExecutor)driver; 
        Object executeScript = js.executeScript("return document.readyState");
			String string = executeScript.toString();
			System.out.println(string);
			
//        Set<Cookie> cookies = driver.manage().getCookies();
//        boolean empty = cookies.isEmpty();
//        
//        if(empty==false) {
//        	System.out.println(cookies.toString());
//        	driver.manage().deleteAllCookies();
//        }else
//        {
//        	System.out.println("no cookies");
//        }
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		try {
		
		for(i=1;i<=5;i++) {
		WebElement heading =driver.findElement(By.xpath("(//table[@class='dataTable']/thead/tr/th)["+i+"]"));
		
			String text = heading.getText();		
			System.out.print(text +" : ");
			
			WebElement findElement = driver.findElement(By.xpath("(//table[@class='dataTable']/tbody/tr/td["+i+"])["+row1+"]"));
			String text2 = findElement.getText();
			Thread.sleep(1000);
			System.out.println(text2);
			
		
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		 Set<Cookie> cookies = driver.manage().getCookies();
	        boolean empty = cookies.isEmpty();
	        
	        if(empty==false) {
	        	System.out.println(cookies.toString());
	        	driver.manage().deleteAllCookies();
	        }else
	        {
	        	System.out.println("no cookies");
	        }
		
		//driver.quit();
	}


}

package webtable;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class alerts {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vishal");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(4000);
		alert.accept();
		//Thread.sleep(4000);
		alert.accept();

		
		
	}

}

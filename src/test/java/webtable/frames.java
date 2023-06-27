package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement findElement = driver.findElement(By.tagName("frameset"));
		
		 WebDriver frame = driver.switchTo().frame(findElement);
		List <WebElement> findElement2 = frame.findElements(By.tagName("frame"));
		 int size = findElement2.size();
		 System.out.println(size);

		
//		WebElement findElement = driver.findElement(By.xpath("(//input[@name='mytext2'])"));
//		findElement.click();
//		WebElement findElement1 = driver.findElement(By.xpath("(//input[@name='mytext3'])"));
//		findElement1.click();

				 
	}

}

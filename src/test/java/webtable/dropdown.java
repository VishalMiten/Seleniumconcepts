package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class dropdown {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement findElement = driver.findElement(By.xpath("//input[@name='firstName']"));
		findElement.sendKeys("Vishal Praveen");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select option = new Select(findElement2);
		List<WebElement> options = option.getOptions();	
		for(int i=0;i<options.size();i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
	}

}

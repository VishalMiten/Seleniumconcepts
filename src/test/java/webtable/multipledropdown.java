package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class multipledropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='second']"));
		System.out.println(findElement.toString());
		
		Select a= new Select(findElement);
		boolean multiple = a.isMultiple();
		System.out.println(multiple);
		List<WebElement> options = a.getOptions();
		for(int i=0;i<options.size();i++) {
			a.selectByIndex(i);
			
		}
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			String webElement = allSelectedOptions.get(i).getText();
			System.out.println(webElement);
			
		}
		
		a.deselectAll();

	}

}

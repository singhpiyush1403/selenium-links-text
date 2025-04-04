
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("Http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		  System.out.println(list.size());
		  
		  for(int i=0; i<list.size(); i++) {
			  System.out.println(list.get(i).getText());
		  }
		  
		  for(WebElement element : list) {
			  System.out.println(element.getText());
		  }
		  
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  driver.quit();
		
	}
}



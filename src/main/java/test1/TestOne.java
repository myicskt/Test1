package test1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne {

	@Test
	public void init(){
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("allbox")).click();
		
		WebElement checkboxall = driver.findElement(By.name("allbox"));
		if (checkboxall.isSelected() == true) {
			System.out.println("Toggle all  is checked ");
		}
		
		driver.close();
			
	}

}

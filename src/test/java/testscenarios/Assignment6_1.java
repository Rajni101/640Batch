package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_1 {

	public static void main(String[] args) {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    new Select(driver.findElement(By.id("speed"))).selectByVisibleText("Fast");
    new Select(driver.findElement(By.id("files"))).selectByVisibleText("DOC file");
    new Select(driver.findElement(By.id("number"))).selectByVisibleText("3");
    new Select(driver.findElement(By.id("products"))).selectByVisibleText("Bing");
    new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Avatar");
     
    
	}

}

package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tirupatibalaji {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://tirupatibalaji.ap.gov.in/#/login");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Sign Up")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("entity")).click();
    driver.findElement(By.name("name")).sendKeys("abc");
	
	}

}

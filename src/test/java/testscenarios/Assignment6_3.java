package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_3 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
    new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Assam");
    
	}

}

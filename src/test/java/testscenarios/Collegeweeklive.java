package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweeklive {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://collegeweeklive.com/go-signup/");
    Thread.sleep(3000);
    driver.findElement(By.id("firstName")).sendKeys("abc");
    driver.findElement(By.id("lastName")).sendKeys("def");
    driver.findElement(By.id("emailAddress")).sendKeys("abcggggg@gmail.com");
    driver.findElement(By.id("phoneNumber")).sendKeys("98911");
    driver.findElement(By.id("password")).sendKeys("abcdefg");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("abcdefg");
    Select countryofcitizenship = new Select(driver.findElement(By.name("nationality")));
    countryofcitizenship.selectByValue("AL");
    Select Iama = new Select(driver.findElement(By.name("attendeeType")));
    Iama.selectByValue("Parent");
    Select AST = new Select(driver.findElement(By.id("questions[q_134]")));
    AST.selectByValue("996");
    driver.findElement(By.id("questions[q_135]")).click();
    driver.findElement(By.id("questions[q_136]")).click();
    driver.findElement(By.id("questions[q_137]")).click();
    driver.findElement(By.id("submit")).click();
	}

}

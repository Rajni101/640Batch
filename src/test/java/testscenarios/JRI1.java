package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI1 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://www.justrechargeit.com/SignUp.aspx");
    driver.manage().window().maximize();
    driver.findElement(By.id("signup_name")).sendKeys("abc");	
    driver.findElement(By.id("signup_mobileno")).sendKeys("9890768192");
    driver.findElement(By.id("signup_email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("signup_password")).sendKeys("565321");
    driver.findElement(By.id("checkbox")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("imgbtnSubmit")).click();
	
   
	
	}

}


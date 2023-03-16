package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7hyperlink {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://www.justrechargeit.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Sign In")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Forgot your password?")).click();

	}

}

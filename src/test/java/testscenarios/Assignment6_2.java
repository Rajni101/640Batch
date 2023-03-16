package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_2 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("https://collegeweeklive.com/go-signup");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
    Thread.sleep(6000);
    driver.findElement(By.className("multiselect")).click();
    driver.findElement(By.name("questions[q_19][1]")).click();
    driver.findElement(By.name("questions[q_19][4]")).click();
    driver.findElement(By.name("questions[q_19][2]")).click();   
	}

}

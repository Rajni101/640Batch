package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JRI_Login {

	public static void main(String[] args) {
		
        //create webdriver object
		WebDriver driver;
		
		//open chrome browser 
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        
		//type the URL
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		// maximise the page
		driver.manage().window().maximize();
		
		//Type in invalid data into the fields
		driver.findElement(By.id("txtUserName")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("txtPasswd")).sendKeys("at");
		
		driver.findElement(By.id("txtCaptcha")).sendKeys("12");
		
		//click on sign button
		driver.findElement(By.id("imgbtnSignin")).click();
		
	}

}

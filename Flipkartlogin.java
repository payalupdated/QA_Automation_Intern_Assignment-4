package flipkart;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkartlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String emailId = "payal16pradhan@gmail.com";
		String phoneNumber = "9692342911";

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement elementToHover = driver.findElement(By.xpath("//a[@title='Login']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).build().perform();
		//driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		//***** Provide mobile number/ emailid and verify *********
		//driver.findElement(By.className("r4vIwl BV+Dqf")).sendKeys("9692342911");
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("phoneNumber");
		//driver.findElement(By.className("QqFHMw twnTnD _7Pd1Fp")).click();
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		/*System.out.println("I am here 1");
		//Have never come across logging in through OTP verification through automation.
		//Managed to enter the OTP manually to login
		//****** Search for your product *********
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("I am here 2");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='zDPmFV']"))).click();
		System.out.println("I am here 3"); */
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("google pixel 9a");
		driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[contains(text(),'Google Pixel 9A (Porcelain, 256 GB)')]")).click();
		
		//Child window handling
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		//********* Logout ************
		WebElement My_Account = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
		actions.moveToElement(My_Account).build().perform();
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();


		



		
		


	}

}

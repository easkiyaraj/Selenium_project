import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locatorstrategy {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        username.click();
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("admin123");
        password.click();
        WebElement click=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        click.click();
    }
}

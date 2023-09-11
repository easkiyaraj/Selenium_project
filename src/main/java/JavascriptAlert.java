import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptAlert {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"))
                .click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(5000);
        }catch (Exception e){}

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"))
                .click();
        Alert confirm=driver.switchTo().alert();
        confirm.accept();
        try {
            Thread.sleep(5000);
        }catch (Exception e){}

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"))
                .click();
        Alert prompt=driver.switchTo().alert();
        prompt.sendKeys("easki");
        try {
            Thread.sleep(5000);
        }catch (Exception e){}
        prompt.accept();
    }
}

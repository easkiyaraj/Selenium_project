import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class KeybordAction {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/inputtools/try/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys("Hello world");
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys("Hello");
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys("world");
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e){}
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.xpath("//textarea[@id='demobox']"))
                .sendKeys(Keys.DELETE);
    }
}

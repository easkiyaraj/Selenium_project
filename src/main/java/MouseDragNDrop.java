import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseDragNDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement from=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
        WebElement to=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();
    }
}

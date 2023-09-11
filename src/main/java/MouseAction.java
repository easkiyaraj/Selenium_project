import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseAction {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        WebElement checkouthere=driver.findElement(By.xpath("//button[normalize-space()='Checkout here']"));
        Actions actions=new Actions(driver);
//        actions.moveToElement(checkouthere).build().perform();
//        actions.contextClick(checkouthere).perform();
        actions.moveToElement(checkouthere).click(checkouthere).build().perform();
    }
}

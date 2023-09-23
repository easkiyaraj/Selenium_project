package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.SocketOption;
import java.time.Duration;

public class AdminPage {
    WebDriver ldriver;
    public AdminPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void verifyAdmin()
    {
        WebElement aa=ldriver.findElement(By.tagName("span"));
        aa.click();
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("admin"));

//        String actual_url = ldriver.getCurrentUrl();
//        System.out.println(actual_url);
//        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
    }
}

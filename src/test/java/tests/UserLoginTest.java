package tests;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UserLoginTest {
    //    private static final By USERNAME=By.xpath("//input[@placeholder='Username']");
//    private static final By PASSWORD=By.xpath("//input[@placeholder='Password']");
//    private  static final By BUTTON=By.xpath("//button[normalize-space()='Login']");
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginpage=new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);

        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();

        adminPage.verifyAdmin();
    }
}

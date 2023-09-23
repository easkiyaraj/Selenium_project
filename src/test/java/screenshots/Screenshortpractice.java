package screenshots;

import Pageobject.AdminPage;
import Pageobject.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshortpractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage loginpage = new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);

        loginpage.fillUsername("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickButton();

        adminPage.verifyAdmin();

        TakesScreenshot screenshort = (TakesScreenshot) driver;
        File screenshortfile = screenshort.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("admin.png");
        try {
            FileUtils.copyFile(screenshortfile, destinationfile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

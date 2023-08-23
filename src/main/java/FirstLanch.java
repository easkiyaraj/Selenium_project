import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLanch {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.quit();
    }
}

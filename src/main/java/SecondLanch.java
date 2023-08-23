import org.openqa.selenium.chrome.ChromeDriver;

public class SecondLanch {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/java/java_switch.asp");
        driver.manage().window().maximize();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavascriptExcutorpractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selectorshub.com/xpath-practice-page/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("console.log('Hello World hii easki');");
//        WebElement checkbox1=driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_15']"));
//        js.executeScript("arguments[0].click();",checkbox1);
//        WebElement checkbox2=driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_15']"));
//        js.executeScript("arguments[0].scrollIntoView();",checkbox2);
//        checkbox2.click();
        String title=(String) js.executeScript("return document.title");
        System.out.println(title);

    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumPractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement userid=driver.findElement(By.xpath("//input[@id='userId']"));userid.sendKeys("easki317@gmail.com");
        userid.click();
        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("Joyeaski");
        WebElement company=driver.findElement(By.xpath("//input[@placeholder='Enter your company']"));
        company.sendKeys("toppan");
        WebElement number=driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
        number.sendKeys("8870671772");
        WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
        submit.click();
        driver.findElement(By.xpath("//label[normalize-space()='Can you enter name here through automation']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("easki");
        WebElement GarryWhite=driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
        System.out.println(GarryWhite.isSelected());
        GarryWhite.click();
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){}
        System.out.println(GarryWhite.isSelected());
//        driver.findElement(By.xpath("//button[normalize-space()='Checkout here']")).click();
//        Select cars=(Select)driver.findElement(By.xpath("//select[@id='cars']"));
//        cars.selectByVisibleText("Audi");
        driver.findElement(By.xpath("//input[@name='the_date']")).sendKeys("08312023");
    }
}

package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver ldriver;
    private static final By USERNAME=By.xpath("//input[@placeholder='Username']");
    private static final By PASSWORD=By.xpath("//input[@placeholder='Password']");
    private static final By Button=By.xpath("//button[normalize-space()='Login']");

    public LoginPage(WebDriver rdriver) {
        ldriver=rdriver;

    }

    public void fillUsername(String username)
   {
      ldriver.findElement(USERNAME).sendKeys(username);
   }
   public void fillPassword(String password){
       ldriver.findElement(PASSWORD).sendKeys(password);
   }
   public void clickButton(){
       ldriver.findElement(Button).click();
   }
}

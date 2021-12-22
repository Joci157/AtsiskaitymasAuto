package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public By myAccount = By.linkText("My Account");
    public By login = By.linkText("Login");
    public By email = By.id("input-email");
    public By password = By.id("input-password");
    public By submit = By.xpath("//input[@type='submit']");



    public WebElement getMyAccount(){
        return driver.findElement(myAccount);
    }

    public WebElement getLogin(){
        return driver.findElement(login);
    }

    public WebElement getEmail(){
        return driver.findElement(email);
    }

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public WebElement findSubmitButton(){
        return driver.findElement(submit);
    }


}

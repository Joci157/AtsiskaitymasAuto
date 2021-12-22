package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;


public class LoginTest extends BaseTest{

    @Test(priority = 1)
    public void clickOnLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.getMyAccount().click();
        loginPage.getLogin().click();
    }

    @Test(priority = 2)
    public void doesLoginAndRegistrationBlocksAreVisible(){

        String registrationHeading = driver.findElement(By.xpath("//h2[text()='New Customer']")).getText();
        String expectedRegistrationHeading = "New Customer";

        assertEquals(registrationHeading, expectedRegistrationHeading, "Expected heading was different");

        String loginHeading = driver.findElement(By.xpath("//h2[text()='Returning Customer']")).getText();
        String expectedLoginHeading = "Returning Customer";
        assertEquals(loginHeading, expectedLoginHeading, "Expected heading was different");
    }

    @Test(priority = 3)
    public void entersWrongDataToLoginSectionsAndChecksErrorMessage() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.getEmail().sendKeys("wrongdata@gmail.com");
        loginPage.getPassword().sendKeys("sncsvsjso");
        loginPage.findSubmitButton().click();


        //WebElement errorMessage = driver.findElement();


    }


}

package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import pages.CategoryPage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class NavigationTest extends BaseTest{



    @DataProvider(name = "products")
    public static Object[][] productsData(){
        return new Object[][]{
                {"iPod Nano"},
                {"iPod Touch"},
                {"iPod Shuffle"}
        };
    }

    @Test (priority = 1)
    public void opensMP3Players() throws InterruptedException {
        CategoryPage categoryPage = new CategoryPage(driver);


        WebElement categoryOfProduct = driver.findElement(By.linkText("MP3 Players"));
        Actions action = new Actions(driver);
        action.moveToElement(categoryOfProduct).perform();

        categoryPage.showAllPlayers().click();


        String categoryHeading = driver.findElement(By.xpath("//h2['MP3 Players']")).getText();
        String expectedCategoryHeading = "MP3 Players";
        assertEquals(categoryHeading, expectedCategoryHeading, "Category heading was not as expected");
    }

    @Test(priority = 2)
    public void productsLayout() throws InterruptedException {
        CategoryPage categoryPage = new CategoryPage(driver);

        categoryPage.chooseListView().click();
    }

    @Test(dataProvider = "products", priority = 3)
    public void addProductToCart(String productName) throws InterruptedException {
        driver.findElement(By.linkText(productName)).findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();

    }



}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {

    public WebDriver driver;
    public CategoryPage(WebDriver driver){
        this.driver = driver;
    }

    public By allPlayers = By.linkText("Show All MP3 Players");
    public By list = By.id("list-view");

    public WebElement showAllPlayers(){
        return  driver.findElement(allPlayers);
    }

    public WebElement chooseListView(){
        return driver.findElement(list);
    }




}

package pl.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiMainPage extends AbstractPage {

    @FindBy(linkText = "O Wikipedii")
    WebElement description;

    @FindBy(css = ".cbnnr-main")
    WebElement monumentsButton;

    @FindBy(css = "#searchInput")
    WebElement searchInp;

    @FindBy(id = "searchButton")
    WebElement button;

    public WikiMainPage(WebDriver driver) {
        super(driver);
    }

    public void writeText(){
        Assertions.assertEquals(driver.getTitle(), "Wikipedia, wolna encyklopedia");
        searchInp.sendKeys("Warszawa");
    }

    public void clickButton(){
        button.click();
    }

    public void clickMonuments(){
        monumentsButton.click();
    }

    public void clickDescriptionWiki(){
        description.click();
    }
}

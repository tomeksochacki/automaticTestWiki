package pl.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.pages.WikiMainPage;

public class TestBase {
    String url = "https://pl.wikipedia.org/wiki/Wikipedia:Strona_g%C5%82%C3%B3wna";

    WebDriver webDriver;
    public WikiMainPage wikiMainPage;

    public void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        wikiMainPage = new WikiMainPage(webDriver);
    }

    @BeforeEach
    void openSession(){
        setup();
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

   /* @AfterEach
    void closeSession(){
        webDriver.quit();
        System.out.printf("sessions is closed");
    }*/
}

package pl.tests;

import org.junit.jupiter.api.Test;
import pl.pages.WikiMainPage;

public class TestWikiSearch extends TestBase {

    @Test
    public void searchWarsaw(){
        wikiMainPage.clickDescriptionWiki();
        wikiMainPage.clickMonuments();
        wikiMainPage.writeText();
        wikiMainPage.clickButton();
    }
}

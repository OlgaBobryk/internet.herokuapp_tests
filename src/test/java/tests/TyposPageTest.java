package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposPageTest extends BaseTest{
    @Test
    public void spellCheckTest(){
        TyposPage typosPage=new TyposPage(driver);
        typosPage.openPage();
        typosPage.findeMistake();
        String expectedElement = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(typosPage.findeMistake(), expectedElement, "There is  mistake 'won,t'");

    }
}

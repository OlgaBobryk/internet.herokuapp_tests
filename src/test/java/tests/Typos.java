package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Typos extends BaseTest{
    @Test
    public void spellCheckTest(){
        //Open url of page
        driver.get(Urls.TYPOS_URL);

        //Add check
        String actualElement= driver.findElement(By.cssSelector("p:last-child")).getText();
        String expectedElement = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actualElement,expectedElement, "There is  mistake 'won,t'");

    }
}

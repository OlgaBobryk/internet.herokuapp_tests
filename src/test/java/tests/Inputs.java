package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs extends BaseTest {

    @Test
    public void arrowUpTest() {
        //Open ur of page
        driver.get(Urls.INPUTS_URL);
        //Input number
        driver.findElement(By.cssSelector("input[type='number']"));

        //Add check
        WebElement element = driver.findElement(By.cssSelector("input[type='number']"));
        element.sendKeys(Keys.ARROW_UP);
        element.sendKeys(Keys.ARROW_UP);
        element.sendKeys(Keys.ARROW_UP);
        element.sendKeys(Keys.ARROW_DOWN);
        String actualResult = element.getAttribute("value");
        String expectedResult = "2";
        Assert.assertEquals(actualResult, expectedResult, "The result is different");
    }
}
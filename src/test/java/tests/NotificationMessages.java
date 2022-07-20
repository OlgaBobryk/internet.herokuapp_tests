package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class NotificationMessages extends BaseTest {
    @Test
    public void successfulActionIsExpectedTest() {
        //Open url of page
        driver.get(Urls.NOTIFICATION_MESSAGE_URL);
        //Click
        driver.findElement(By.xpath("//a[contains (text(), 'Click here')]")).click();
        //Add check
        WebElement element = driver.findElement(By.xpath("//div[@id='flash']"));
        boolean actualElement = element.getText().contains("Action successful");
        Assert.assertTrue(actualElement, "There isn't this message");
    }
}

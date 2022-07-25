package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagePage extends BasePage{
    private By CLICK_HERE=By.xpath("//a[contains (text(), 'Click here')]");
    private By MESSAGE=By.xpath("//div[@id='flash']");


    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get(Urls.NOTIFICATION_MESSAGE_URL);
    }
    public void click(){
        driver.findElement(CLICK_HERE).click();
    }
    public boolean messageIsDisplayed(){
       return driver.findElement(MESSAGE).getText().contains("Action successful");
    }

}

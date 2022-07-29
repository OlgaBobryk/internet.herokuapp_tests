package pages.alert;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class JsAlertPage extends BasePage {
    private By JS_ALERT = By.xpath("(//button)[1]");



    public JsAlertPage(WebDriver driver) {
        super(driver);
    }

    public void openUrl() {
        driver.get(Urls.JAVA_SCRIPT_ALERTS_URL);
    }

    public void clickJsAlert() {
        driver.findElement(JS_ALERT).click();
    }

    public String checkJsAlert() {
        return driver.switchTo().alert().getText();
             }

    public void acceptJsAlert() {
        driver.switchTo().alert().accept();
    }
}

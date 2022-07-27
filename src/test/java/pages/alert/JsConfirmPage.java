package pages.alert;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class JsConfirmPage extends BasePage {
    private By JS_CONFIRM = By.xpath("(//button)[2]");

    public JsConfirmPage(WebDriver driver) {
        super(driver);
    }

    public void openUrl() {
        driver.get(Urls.JAVA_SCRIPT_ALERTS_URL);
    }

    public void clickJsConfirm() {
        driver.findElement(JS_CONFIRM).click();
    }

    public String checkJsConfirm() {
        return driver.switchTo().alert().getText();
    }

    public void dismissJsConfirm() {
        driver.switchTo().alert().dismiss();
    }

}

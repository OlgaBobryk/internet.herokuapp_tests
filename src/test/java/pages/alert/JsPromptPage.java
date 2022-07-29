package pages.alert;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class JsPromptPage extends BasePage {

    private By JS_PROMPT = By.xpath("(//button)[3]");
    private By RESULT = By.id("result");

    public JsPromptPage(WebDriver driver) {
        super(driver);
    }

    public void openUrl() {
        driver.get(Urls.JAVA_SCRIPT_ALERTS_URL);
    }

    public void clickJsPrompt() {
        driver.findElement(JS_PROMPT).click();
    }

    public void inputText() {
        driver.switchTo().alert().sendKeys("Hello");
    }

    public void acceptJsPrompt() {
        driver.switchTo().alert().accept();
    }

    public boolean findResult() {
        return driver.findElement(RESULT).getText().contains("Hello");
    }

}



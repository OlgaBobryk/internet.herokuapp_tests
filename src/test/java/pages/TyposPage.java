package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage {
    private By TEXT = By.cssSelector("p:last-child");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Urls.TYPOS_URL);
    }

    public String findeMistake() {
        return driver.findElement(TEXT).getText();
    }
}

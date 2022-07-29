package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputsPage extends BasePage {
    private By NUMBER_INPUT = By.cssSelector("input[type='number']");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Urls.INPUTS_URL);
    }

    public void upInput() {
        driver.findElement(NUMBER_INPUT).sendKeys(Keys.ARROW_UP);
    }

    public void downInput() {
        driver.findElement(NUMBER_INPUT).sendKeys(Keys.ARROW_DOWN);
    }

    public String infoAboutResult() {
        return driver.findElement(NUMBER_INPUT).getAttribute("value");
    }
}

package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;

public class OpenCheckboxesPage extends BasePage{


    public OpenCheckboxesPage(WebDriver driver) {
        super(driver);
    }
    public void openUrl(){
        driver.get(Urls.CHECKBOXES_URL);
    }
}

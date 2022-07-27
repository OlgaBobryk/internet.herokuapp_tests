package pages.checkboxPage;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class OpenCheckboxesPage extends BasePage {


    public OpenCheckboxesPage(WebDriver driver) {
        super(driver);
    }
    public void openUrl(){
        driver.get(Urls.CHECKBOXES_URL);
    }
}

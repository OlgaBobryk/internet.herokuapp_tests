package pages.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class NewPageCreatedPage extends BasePage {
    private By SUCCESSFUL_MESSAGE = By.xpath("//h3");
    private By FILE_NAME = By.xpath("//div[@id='uploaded-files']");

    public NewPageCreatedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(SUCCESSFUL_MESSAGE).isDisplayed();
    }

    public String textOfFileName() {
        return driver.findElement(FILE_NAME).getText();
    }
}

package pages.checkboxPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FirstCheckboxPage extends BasePage {
    private By FIRST_CHECKBOX=By.cssSelector("form :first-child");

    public FirstCheckboxPage(WebDriver driver) {
        super(driver);
    }

    public boolean isFirstCheckboxSelected(){
        return driver.findElement(FIRST_CHECKBOX).isSelected();

    }
    public void firstCheckboxClick(){
        driver.findElement(FIRST_CHECKBOX).click();
    }

}

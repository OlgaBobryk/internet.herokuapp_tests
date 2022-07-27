package pages.checkboxPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SecondCheckboxPage extends BasePage {
    private  By SECOND_CHECKBOX= By.cssSelector("form :last-child");

    public SecondCheckboxPage(WebDriver driver) {
        super(driver);
    }
    public boolean isSecondCheckboxSelected() {
        return driver.findElement(SECOND_CHECKBOX).isSelected();
    }
    public void secondCheckboxClick(){
        driver.findElement(SECOND_CHECKBOX).click();
    }

}

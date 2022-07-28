package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    private By DROPDOWN_LIST = By.id("dropdown");


    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Urls.DROPDOWN_URL);
    }

    public int checkSize() {
        WebElement dropdownList = driver.findElement(DROPDOWN_LIST);
        Select selectOption = new Select(dropdownList);
        return selectOption.getOptions().size();
    }

    public String checkFirstElement() {
        WebElement dropdownList = driver.findElement(DROPDOWN_LIST);
        Select selectOption = new Select(dropdownList);
        selectOption.selectByValue("1");
        String textOption1 = selectOption.getFirstSelectedOption().getText();
        return textOption1;
    }

    public String checkSecondElement() {
        WebElement dropdownList = driver.findElement(DROPDOWN_LIST);
        Select selectOption = new Select(dropdownList);
        selectOption.selectByValue("2");
        String textOption2 = selectOption.getFirstSelectedOption().getText();
        return textOption2;
    }
}

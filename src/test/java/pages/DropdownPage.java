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

    public boolean checkSize() {
        WebElement dropdownList = driver.findElement(DROPDOWN_LIST);
        Select selectOption = new Select(dropdownList);
        selectOption.getOptions().size();
        return true;
    }


    public boolean checkFirstElement() {
        WebElement dropdownList = driver.findElement(DROPDOWN_LIST);
        Select selectOption = new Select(dropdownList);
        selectOption.selectByValue("1");
        return true;
    }

    public boolean checkSecondElement() {
        WebElement dropdownList = driver.findElement(DROPDOWN_LIST);
        Select selectOption = new Select(dropdownList);
        selectOption.selectByValue("2");
        return true;
    }
}

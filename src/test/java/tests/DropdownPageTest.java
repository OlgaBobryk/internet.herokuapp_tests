package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownPageTest extends BaseTest {


    @Test
    public void checkDropdown() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openPage();
        dropdownPage.checkSize();
        Assert.assertTrue(dropdownPage.checkSize(), "There aren't any elements");
    }

    @Test
    public void firstOptionIsSelected() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openPage();
        dropdownPage.checkFirstElement();
        Assert.assertTrue(dropdownPage.checkFirstElement(), "The first element isn't selected");
    }

    @Test
    public void secondOptionIsSelected() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openPage();
        dropdownPage.checkSecondElement();
        Assert.assertTrue(dropdownPage.checkFirstElement(), "The second element isn't selected");
    }
}

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
        Assert.assertEquals(dropdownPage.checkSize(), 3, "Number of elements is different");
    }

    @Test
    public void firstOptionIsSelected() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openPage();
        dropdownPage.checkFirstElement();
        Assert.assertEquals(dropdownPage.checkFirstElement(), "Option 1","The first element isn't selected");
    }

    @Test
    public void secondOptionIsSelected() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openPage();
        dropdownPage.checkSecondElement();
        Assert.assertEquals(dropdownPage.checkSecondElement(), "Option 2", "The second element isn't selected");
    }

}

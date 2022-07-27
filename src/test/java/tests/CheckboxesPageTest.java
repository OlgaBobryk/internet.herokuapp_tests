package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.checkboxPage.FirstCheckboxPage;
import pages.checkboxPage.OpenCheckboxesPage;
import pages.checkboxPage.SecondCheckboxPage;

public class CheckboxesPageTest extends BaseTest {


    @Test
    public void firstCheckboxUncheckedTest() {
        OpenCheckboxesPage openCheckboxesPage = new OpenCheckboxesPage(driver);
        openCheckboxesPage.openUrl();
        FirstCheckboxPage firstCheckboxPage = new FirstCheckboxPage(driver);
        firstCheckboxPage.isFirstCheckboxSelected();
        Assert.assertFalse(firstCheckboxPage.isFirstCheckboxSelected(), "This element is selected");
    }

    @Test
    public void firstCheckboxCheckedTest() {
        OpenCheckboxesPage openCheckboxesPage = new OpenCheckboxesPage(driver);
        openCheckboxesPage.openUrl();
        FirstCheckboxPage firstCheckboxPage = new FirstCheckboxPage(driver);
        firstCheckboxPage.firstCheckboxClick();
        firstCheckboxPage.isFirstCheckboxSelected();
        Assert.assertTrue(firstCheckboxPage.isFirstCheckboxSelected(), "This element isn't selected");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        OpenCheckboxesPage openCheckboxesPage = new OpenCheckboxesPage(driver);
        openCheckboxesPage.openUrl();
        SecondCheckboxPage secondCheckboxPage = new SecondCheckboxPage(driver);
        secondCheckboxPage.isSecondCheckboxSelected();
        Assert.assertTrue(secondCheckboxPage.isSecondCheckboxSelected(), "This element isn't selected");
    }

    @Test
    public void secondCheckboxUncheckedTest() {
        OpenCheckboxesPage openCheckboxesPage = new OpenCheckboxesPage(driver);
        openCheckboxesPage.openUrl();
        SecondCheckboxPage secondCheckboxPage = new SecondCheckboxPage(driver);
        secondCheckboxPage.secondCheckboxClick();
        secondCheckboxPage.isSecondCheckboxSelected();
        Assert.assertFalse(secondCheckboxPage.isSecondCheckboxSelected(), "This element is selected");
    }
}

package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    private void openurl() {
        //Open url of  page
        driver.get(Urls.CHECKBOXES_URL);
    }

    @Test
    public void firstCheckboxUncheckedTest() {
        openurl();
        //Checkbox
        driver.findElement(By.cssSelector("form :first-child"));
        //Add check
        boolean firstCheckbox = driver.findElement(By.cssSelector("form :first-child")).isSelected();
        Assert.assertFalse(firstCheckbox, "This element is selected");
    }

    @Test
    public void firstCheckboxCheckedTest() {
        openurl();
        //Click
        driver.findElement(By.cssSelector("form :first-child")).click();
        //Add check
        boolean checkboxFirst = driver.findElement(By.cssSelector("form :first-child")).isSelected();
        Assert.assertTrue(checkboxFirst, "This element isn't selected");
    }

    @Test
    public void secondCheckboxCheckedTest() {
        openurl();
        //Checkbox
        driver.findElement(By.cssSelector("form :last-child"));
        //Add check
        boolean secondCheckbox = driver.findElement(By.cssSelector("form :last-child")).isSelected();
        Assert.assertTrue(secondCheckbox, "This element isn't selected");
    }

    @Test
    public void secondCheckboxUncheckedTest() {
        openurl();
        //Click
        driver.findElement(By.cssSelector("form :last-child")).click();
        //Add check
        boolean checkboxsecond = driver.findElement(By.cssSelector("form :last-child")).isSelected();
        Assert.assertFalse(checkboxsecond, "This element is selected");
    }
}

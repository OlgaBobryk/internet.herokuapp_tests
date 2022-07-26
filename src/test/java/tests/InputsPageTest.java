package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsPageTest extends BaseTest {

    @Test
    public void arrowUpTest() {
        InputsPage inputsPage=new InputsPage(driver);
        inputsPage.openPage();
        inputsPage.upInput();
        inputsPage.upInput();
        inputsPage.upInput();
        inputsPage.downInput();
        String actualResult = inputsPage.infoAboutResult();
        String expectedResult = "2";
        Assert.assertEquals(actualResult, expectedResult, "The result is different");
    }
}
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;

public class DroppableTest extends BaseTest {
    @Test
    public void checkTextDragAndDrop() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openUrl();
        droppablePage.dragAndDropElement();
        droppablePage.findText();
        Assert.assertTrue(droppablePage.findText(), "This text isn't different");

    }
}

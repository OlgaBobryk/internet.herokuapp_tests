package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

public class NotificationMessagesPageTest extends BaseTest {
    @Test
    public void successfulActionIsExpectedTest() {
        NotificationMessagePage notificationMessagePage=new NotificationMessagePage(driver);
        notificationMessagePage.openPage();
        notificationMessagePage.click();
        notificationMessagePage.messageIsDisplayed();
        Assert.assertTrue(notificationMessagePage.messageIsDisplayed(), "There isn't this message");

    }
}

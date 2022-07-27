package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.alert.JsAlertPage;
import pages.alert.JsConfirmPage;
import pages.alert.JsPromptPage;

public class AlertsPageTest extends BaseTest {

    @Test
    public void textOfJsAlert() {
        JsAlertPage jsAlert = new JsAlertPage(driver);
        jsAlert.openUrl();
        jsAlert.clickJsAlert();
        String actualTextOfJsAlert = jsAlert.checkJsAlert();
        jsAlert.acceptJsAlert();
        Assert.assertEquals(actualTextOfJsAlert, "I am a JS Alert", "There isn't this text");

    }

    @Test
    public void textOfJsConfirm() {
        JsConfirmPage jsConfirm = new JsConfirmPage(driver);
        jsConfirm.openUrl();
        jsConfirm.clickJsConfirm();
        String actualTextOfJsConfirm = jsConfirm.checkJsConfirm();
        jsConfirm.dismissJsConfirm();
        Assert.assertEquals(actualTextOfJsConfirm, "I am a JS Confirm", "There isn't this text");
    }

    @Test
    public void textOfJsPrompt() {
        JsPromptPage jsPrompt = new JsPromptPage(driver);
        jsPrompt.openUrl();
        jsPrompt.clickJsPrompt();
        jsPrompt.inputText();
        jsPrompt.acceptJsPrompt();
        jsPrompt.findResult();
        Assert.assertTrue(jsPrompt.findResult(), "There isn't this result");
    }


}

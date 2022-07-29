package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.fileupload.FileUploaderPage;
import pages.fileupload.NewPageCreatedPage;

public class FileUploaderPageTest extends BaseTest {
    @Test
    public void checkFileName() {
        FileUploaderPage fileUploader = new FileUploaderPage(driver);
        fileUploader.openPage();
        removeImplicityWait();
        fileUploader.wait1();
        fileUploader.chooseFile();
        fileUploader.loadFile();
        setImplicityWait();
        NewPageCreatedPage newPage = new NewPageCreatedPage(driver);
        newPage.isSuccessMessageDisplayed();
        newPage.textOfFileName();
        Assert.assertEquals(newPage.textOfFileName(), "my_img.png", "Fileupload is faild");

    }
}

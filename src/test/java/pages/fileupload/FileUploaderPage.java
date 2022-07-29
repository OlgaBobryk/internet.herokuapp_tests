package pages.fileupload;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class FileUploaderPage extends BasePage {
    private By CHOOSE_FILE = By.xpath("//input[@id='file-upload']");
    private By UPLOAD = By.xpath("//input[@id='file-submit']");


    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Urls.FILE_UPLOADER_URL);

    }

    public void wait1() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(UPLOAD));
    }

    public void chooseFile() {
        String path=System.getProperty("user.dir").concat("/src/test/resources/my_img.png");
        driver.findElement(CHOOSE_FILE).sendKeys(path);

    }

    public void loadFile() {
        driver.findElement(UPLOAD).click();
    }
}

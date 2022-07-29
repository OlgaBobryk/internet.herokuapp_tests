package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void settUp() {
        //Open Chrome browser
        PropertyManager propertyManager = new PropertyManager();
        propertyManager.loadData();
        System.setProperty("webdriver.chrome.driver", propertyManager.get("PATH_TO_DRIVER"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        setImplicityWait();
    }

    public void setImplicityWait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void removeImplicityWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

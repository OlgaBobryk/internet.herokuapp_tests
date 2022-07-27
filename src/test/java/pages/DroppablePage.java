package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage extends BasePage {
    private By DRAGGABLE = By.xpath("//div[@id='draggable']");
    private By DROPPABLE = By.xpath("//div[@id='droppable']");

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public void openUrl() {
        driver.get(Urls.DROPPABLE_URL);
    }

    public void dragAndDropElement() {
        WebElement frame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        WebElement el1 = driver.findElement(DRAGGABLE);
        WebElement el2 = driver.findElement(DROPPABLE);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(el1, el2).build().perform();
    }

    public boolean findText() {
        return driver.findElement(DROPPABLE).getText().contains("Dropped!");
    }
}

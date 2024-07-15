package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void navigateToPage(String pageName) {
        WebElement button = Driver.getDriver().findElement
                (By.xpath("//a[. = '" + pageName + "']"));
        button.click();
    }


}

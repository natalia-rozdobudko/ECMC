package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ContactUsPage extends BasePage {


    public static WebElement getInputBox(String fieldName) {
        return Driver.getDriver().findElement
                (with(By.tagName("input"))
                        .below(By.xpath("//label[. = '" + fieldName + "']")));
    }


}

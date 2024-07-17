package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserUtilities {


    public static WebElement getButton(String buttonName) {
        return Driver.getDriver().findElement
                (By.xpath("//button[. = '" + buttonName + "']"));
    }

    public static WebElement getAccordion(String accordionName) {
        return Driver.getDriver().findElement
                (By.xpath("//button[.='" + accordionName + "']"));
    }
}

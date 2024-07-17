package utilities;

import org.openqa.selenium.By;

public class BrowserUtilities {


    public static void clickButton(String buttonName) {
        Driver.getDriver().findElement
                (By.xpath("//button[. = '" + buttonName + "']")).click();
    }
}

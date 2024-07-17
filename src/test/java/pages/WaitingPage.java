package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class WaitingPage extends BasePage {

    @FindBy(id = "initialLoadSpinner")
    public WebElement initialLoadSpinner;

//    @FindBy(className = "accordion-item")
//    public List<WebElement> accordions;


    public WebElement getTextBox(String textBoxName) {
        return Driver.getDriver().findElement(By.xpath
                ("//label[.='" + textBoxName + "']/following-sibling::input"));
    }


}

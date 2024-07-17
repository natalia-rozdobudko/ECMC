package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaitingPage extends BasePage{

    @FindBy(id="initialLoadSpinner")
    public WebElement initialLoadSpinner;



}

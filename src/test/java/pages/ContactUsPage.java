package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ContactUsPage extends BasePage {

    @FindBy(id = "addressState")
    public WebElement stateDropdown;
    @FindBy(id = "messageBox")
    public WebElement messageInputBox;
    @FindBy(xpath = "//input[@placeholder = 'City']")
    public WebElement cityInputBox;
    @FindBy(xpath = "//input[@type = 'checkbox']")
    public WebElement checkBox;
    @FindBy(xpath = "//button[. = 'Submit form']")
    public WebElement submitButton;
    @FindBy(css = ".py-5.text-center>h2")
    public WebElement successMessage;
    @FindBy(xpath = "//label[. ='Agree to terms and conditions']")
    public WebElement agreeToTerms;
    @FindBy(xpath = "//label[. ='Agree to terms and conditions']/following-sibling::div")
    public WebElement agreeToTermsMessages;


    public WebElement getInputBox(String fieldName) {
        return Driver.getDriver().findElement
                (with(By.tagName("input"))
                        .below(By.xpath("//label[. = '" + fieldName + "']")));
    }


}

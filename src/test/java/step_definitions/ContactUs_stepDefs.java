package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUsPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class ContactUs_stepDefs {
    ContactUsPage contactUsPage;
    WebDriverWait wait;

    @Given("user is on {string} page")
    public void user_is_on_page(String pageName) {
        contactUsPage = new ContactUsPage();
        contactUsPage.navigateToPage(pageName);
    }

    @When("user enters {string} in the {string} field")
    public void user_enters_in_the_field(String text, String fieldName) {

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        if (fieldName.equals("Message")) {
            contactUsPage.messageInputBox.sendKeys(text);
        } else if (fieldName.equals("City")) {
            wait.until(ExpectedConditions.visibilityOf(contactUsPage.cityInputBox));
            contactUsPage.cityInputBox.sendKeys(text);
        } else {
            contactUsPage.getInputBox(fieldName).sendKeys(text);
        }

    }

    @When("user selects {string} from the {string}")
    public void user_selects_from_the(String option, String dropdownName) {

        WebElement stateDropdown = contactUsPage.stateDropdown;

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(stateDropdown));

        Select select = new Select(stateDropdown);
        select.selectByVisibleText(option);

    }

    @When("user checks the {string} checkbox")
    public void user_checks_the_checkbox(String checkboxName) {
        contactUsPage.checkBox.click();
    }

    @When("user clicks the {string} button")
    public void user_clicks_the_button(String buttonName) {
        contactUsPage.submitButton.click();
    }

    @Then("user should see message {string}")
    public void user_should_see_message(String expectedMessageText) {

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(contactUsPage.successMessage));

    //The textContent property is used to retrieve the text content of the <h2> element.

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String actualMessageText = (String) js.executeScript("return arguments[0].textContent;", contactUsPage.successMessage);

        System.out.println("expectedMessageText = " + expectedMessageText);
        System.out.println("actualMessageText = " + actualMessageText);

        Assert.assertTrue(actualMessageText.contains(expectedMessageText));

    }
}

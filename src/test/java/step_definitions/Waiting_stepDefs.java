package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WaitingPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class Waiting_stepDefs {
    WaitingPage waitingPage;
    WebDriverWait wait;
    Alert alert;
    String alertText;

    @When("the page has fully loaded")
    public void the_page_has_fully_loaded() {

        waitingPage = new WaitingPage();

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(waitingPage.initialLoadSpinner));

    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String buttonName) {

        WebElement button = BrowserUtilities.getButton(buttonName);

        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(button));

        button.click();

    }

    @Then("an alert should be displayed with the text")
    public void an_alert_should_be_displayed_with_the_text() {
        alert = Driver.getDriver().switchTo().alert();
        alertText = alert.getText();
    }

    @Then("the user accepts the alert")
    public void the_user_accepts_the_alert() {
        alert.accept();
    }

    @When("the user clicks on {string} accordion")
    public void the_user_clicks_on_accordion(String accordionName){
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        WebElement accordion = BrowserUtilities.getAccordion(accordionName);
        wait.until(ExpectedConditions.elementToBeClickable(accordion));
        accordion.click();
    }

    @When("the user enters alert text in {string}")
    public void the_user_enters_alert_text_in(String textBoxName) {

        waitingPage.getTextBox(textBoxName).sendKeys(alertText);

    }

    @Then("the third accordion's alert text should match the entered text")
    public void the_third_accordion_s_alert_text_should_match_the_entered_text() {
        alert = Driver.getDriver().switchTo().alert();
        String actualAlertText = alert.getText();

        String expectedAlertText = alertText + " " + alertText;

        Assert.assertEquals(expectedAlertText,actualAlertText);



    }
}

package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardownMethod(Scenario scenario){

        //---> @After: Running after each scenario

        if (scenario.isFailed()){

            byte[] screenShot =
                    ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenShot,"image/png",scenario.getName());
        }

        Driver.closeDriver();

    }

}

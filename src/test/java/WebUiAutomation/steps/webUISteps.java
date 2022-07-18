package WebUiAutomation.steps;

import Page.Web.googleMaps;
import Utilities.Drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class webUISteps {

    googleMaps mapsObj = new googleMaps();

    @Given("{string} browser is initialized with {string} url")
    public void browserIsInitializedWithUrl(String browser, String url) {
        DriverManager.initializeDriver(browser, url);
    }

    @When("User searches location {string} on the search location text-box")
    public void searchLocation(String location) {
        mapsObj.getLocationTextBox().sendKeys(location);
        mapsObj.getLocationTextBox().sendKeys(Keys.ENTER);
    }

    @Then("Verify searched location is {string}")
    public void verifyLocation(String expectedTest) {
        Assert.assertEquals(expectedTest, mapsObj.getSearchedLocationText().getText());
    }
}

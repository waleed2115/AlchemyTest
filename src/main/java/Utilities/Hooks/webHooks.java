package Utilities.Hooks;

import Utilities.Drivers.DriverManager;
import io.cucumber.java.After;

public class webHooks {

    @After
    public void afterScenario() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }
}

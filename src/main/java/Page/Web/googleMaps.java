package Page.Web;

import static Utilities.Drivers.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class googleMaps {

    String searchBox = "searchboxinput";
    String searchedLocationText = "fontHeadlineLarge";

    public WebElement getLocationTextBox() {
        return getDriver().findElements(By.id(searchBox)).get(0);
    }

    public WebElement getSearchedLocationText() {
        return getDriver().findElements(By.className(searchedLocationText)).get(0);
    }
}

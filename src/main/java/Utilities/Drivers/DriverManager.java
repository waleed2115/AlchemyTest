package Utilities.Drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        DriverManager.driver.set(driver);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void initializeDriver(String browser, String appName) {
        WebDriver driver;

        switch (browser) {
            case "chrome" -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                setDriver(driver);
                getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
                getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
                getDriver().get(appName);
            }
            case "firefox" -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions);
                setDriver(driver);
                getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
                getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
                getDriver().get(appName);
            }
            default -> throw new IllegalStateException("invalid browser provided: " + browser);
        }
    }
}

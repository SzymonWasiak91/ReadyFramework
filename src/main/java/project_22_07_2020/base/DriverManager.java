package project_22_07_2020.base;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        webDriver.set(driver);

    }

    public static void createInstance(String browserName) {
        {
            setDriver(DriverFactory.createWebdriverInstance((browserName)));

        }
    }
}
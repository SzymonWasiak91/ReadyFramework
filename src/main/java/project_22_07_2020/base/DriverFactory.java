package project_22_07_2020.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

public class DriverFactory {
    public static WebDriver createWebdriverInstance(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
            if (System.getProperty("webdriver.chrome.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", iDriver.getAbsolutePath());
            }
            driver = new ChromeDriver(OptionsManager.ChromeOptions());


        }
        if (browserName.equalsIgnoreCase("opera")) {
            if (System.getProperty("webdriver.opera.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/operadriver.exe");
                System.setProperty("webdriver.opera.driver", iDriver.getAbsolutePath());
            }
            driver = new OperaDriver(OptionsManager.OperaOptions());


        }
        if (browserName.equalsIgnoreCase("firefox")) {
            if (System.getProperty("webdriver.gecko.driver") == null) {
                File iDriver = new File(System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", iDriver.getAbsolutePath());
                driver = new FirefoxDriver(OptionsManager.FirefoxOptions());
            }

        }
        return driver;
    }
}
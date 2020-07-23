package project_22_07_2020.base;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaOptions;

public class OptionsManager {
    public static ChromeOptions ChromeOptions(){

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    return options;
    }
    public static OperaOptions OperaOptions(){

    OperaOptions options = new OperaOptions();
    options.addArguments("--disable-notifications");
    return options;
    }
    public static FirefoxOptions FirefoxOptions(){
     FirefoxOptions options = new FirefoxOptions();
     FirefoxProfile profile = new FirefoxProfile();
     profile.setPreference("dom.webnotifications.enabled",false);
     options.setCapability(FirefoxDriver.PROFILE, profile);
     return options;

    }
}

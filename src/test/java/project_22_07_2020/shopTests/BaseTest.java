package project_22_07_2020.shopTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import project_22_07_2020.base.DriverManager;

public class BaseTest {
    @BeforeMethod
    @Parameters("browserName")
    public void setUp(String browserName){
        DriverManager.createInstance(browserName);
        WebDriver driver = DriverManager.getDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        DriverManager.getDriver().quit();
    }
}

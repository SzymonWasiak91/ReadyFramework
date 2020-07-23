package project_22_07_2020.pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_22_07_2020.base.DriverManager;
import project_22_07_2020.base.Methods;

public class MainPage_1 {
    @FindBy(xpath = "//input[@name='string']")
    private WebElement searchField;
    @FindBy(xpath = "//form/button[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = "//img[@alt='zamknij']")
    private WebElement allertButton;

//img[@alt='zamknij']

WebDriver driver = DriverManager.getDriver();
Methods waits;

public MainPage_1(){
    PageFactory.initElements(driver,this);{
        this.waits = new Methods(driver);
        }
    }
    public void openMainPage(){
    driver.get("https://allegro.pl/");
    }

    public void searchItem(String item)  {
    waits.waitUntlVisible(allertButton);
    allertButton.click();
    waits.waitUntlVisible(searchField);
    searchField.sendKeys(item);
    waits.waitUntlClicable(searchButton);
    searchButton.click();
    }
}

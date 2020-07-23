package project_22_07_2020.pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_22_07_2020.base.DriverManager;
import project_22_07_2020.base.Methods;

public class ItemPage_3 {
    @FindBy(id = ("add-to-cart-button"))
    private WebElement addToCartButton1;
    @FindBy(xpath = ("//div[@class='m7er_k4 m7er_k4 m7er_wn mpof_ki myre_6m myre_8v_s _e3a48_gZbN9 mryx_24']/a[@href='/koszyk']"))
    private WebElement goToCartButton2;

    WebDriver driver = DriverManager.getDriver();
    Methods waits;

    public ItemPage_3(){
        PageFactory.initElements(driver,this);{
            this.waits = new Methods(driver);
        }
    }
    public void addToCart(){
        waits.waitUntlVisible(addToCartButton1);
        addToCartButton1.click();

    }
    public void goToCart(){
        waits.waitUntlVisible(goToCartButton2);
        goToCartButton2.click();

    }
}


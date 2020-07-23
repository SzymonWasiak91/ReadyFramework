package project_22_07_2020.pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_22_07_2020.base.DriverManager;
import project_22_07_2020.base.Methods;

public class ItemCartPage_4 {
    @FindBy(xpath = "//a[@class='_w7z6o _uj8z7']" )
    private WebElement itemInCartName;
    @FindBy(xpath = "//i[@title='usuń przedmiot']")
    private WebElement deliteButton;

    WebDriver driver = DriverManager.getDriver();
    Methods waits;

    public ItemCartPage_4() {
        PageFactory.initElements(driver, this);
        {
            this.waits = new Methods(driver);
        }
    }
    public String checkPresentItemInCart(){
        waits.waitUntlVisible(itemInCartName);
        System.out.println("Page 4" + " " + itemInCartName.getText());
       String cartName =  itemInCartName.getText();
       return cartName;
    }
    public void deliteItem(){
        waits.waitUntlVisible(deliteButton);
        deliteButton.click();

    }

}

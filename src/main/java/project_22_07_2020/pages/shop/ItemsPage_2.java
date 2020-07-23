package project_22_07_2020.pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_22_07_2020.base.DriverManager;
import project_22_07_2020.base.Methods;

import java.util.List;

public class ItemsPage_2 {

    @FindBy(xpath = ("//*[@id='opbox-listing--base']/div/section/section/article[1]"))
    private WebElement firstItem;
    @FindBy(xpath = ("//h2[@class='_9c44d_LUA1k']"))
    private List<WebElement> listOfItem;
    WebDriver driver = DriverManager.getDriver();
    Methods waits;

    public ItemsPage_2(){
        PageFactory.initElements(driver,this);{
            this.waits = new Methods(driver);
        }
    }
    public void clickFirstItem(){
        waits.waitUntlVisible(firstItem);
        firstItem.click();

    }
//    public String takeItemName()  {
//        waits.waitForListVisible(listOfItem);
//        System.out.println(listOfItem.get(1));
//        String name = listOfItem.get(0).getText();
//        return name;
//    }
public String takeItemName()  {
    waits.waitForListVisible(listOfItem);
    System.out.println("Page 2" +" "+listOfItem.get(0).getText());
    String name = listOfItem.get(0).getText();
    return name;
}

}

package project_22_07_2020.shopTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import project_22_07_2020.base.ReadExcell;
import project_22_07_2020.pages.shop.ItemCartPage_4;
import project_22_07_2020.pages.shop.ItemPage_3;
import project_22_07_2020.pages.shop.ItemsPage_2;
import project_22_07_2020.pages.shop.MainPage_1;

public class ShopifyTest extends BaseTest{
    @DataProvider(name = "excel")
    public Object[][] excellDataProvider(){
     return ReadExcell.readExcelInto2DArry("src/main/resources/excell-data.xlsx","Sheet1",1);
    }
    @Test(dataProvider = "excel")

    public void allegroFirstTest (String item) throws InterruptedException {
        MainPage_1 mainPage1 = new MainPage_1();
        mainPage1.openMainPage();
        mainPage1.searchItem(item);

        ItemsPage_2 itemsPage_2 = new ItemsPage_2();
        itemsPage_2.takeItemName();
        itemsPage_2.clickFirstItem();

        ItemPage_3 itemPage_3 = new ItemPage_3();
        itemPage_3.addToCart();
        itemPage_3.goToCart();

        ItemCartPage_4 itemCartPage_4 = new ItemCartPage_4();
        itemCartPage_4.checkPresentItemInCart();
        itemCartPage_4.deliteItem();


//        String name1 = itemCartPage_4.checkPresentItemInCart();
//        String name2 = itemsPage_2.takeItemName();
//        Assert.assertEquals(itemCartPage_4.checkPresentItemInCart(), itemsPage_2.takeItemName());
//        if (name1 == name2){
//            System.out.println("Zgadza się");
        }
        @Test
        public void allegroSecendTest(){


        }
    }


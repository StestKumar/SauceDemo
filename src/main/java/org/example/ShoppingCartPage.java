package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utility {
    String expectedMessage = loadProp.getProperty("shoppingCartExpectedMessage");

    public void compareShoppingCartMessage() {


        String actual = getTextOfElement(By.className("product-name"));
        Assert.assertEquals(actual, expectedMessage, "shoppingCartActualMessage");
    }

}
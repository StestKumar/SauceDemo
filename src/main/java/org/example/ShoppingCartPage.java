package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utility {
    String expectedMessage = loadProp.getProperty("shoppingCartExpectedMessage");

    public void compareShoppingCartMessage() {


        String actual = getTextOfElement(By.linkText("Build your own computer"));
        Assert.assertEquals(actual, expectedMessage, "shoppingCartActualMessage");
    }

}
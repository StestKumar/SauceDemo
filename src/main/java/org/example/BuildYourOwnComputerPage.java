package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility
{
    //object for loadProp created to use in this class
    LoadProp loadProp = new LoadProp();

    public void chooseAttributesOfComputer()
    {

        //select the processor
        selectByValue(By.id("product_attribute_1"), loadProp.getProperty("option1"));
        //select the ram
        selectByValue(By.id("product_attribute_2"), loadProp.getProperty("option2"));
        //select the HDD
        findByElement(By.id("product_attribute_3_7"));
        //select the OS
        findByElement(By.id("product_attribute_4_9"));
        //click on software autoSelected option
        findByElement(By.id("product_attribute_5_10"));
        //select the software
        findByElement(By.id("product_attribute_5_11"));
        //click on add to cart
        findByElement(By.id("add-to-cart-button-1"));
        //click on shopping cart button
        findByElement(By.linkText("Shopping cart"));

    }
}

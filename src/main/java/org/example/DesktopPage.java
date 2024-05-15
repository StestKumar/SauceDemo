package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DesktopPage extends Utility
    {

        private By _navigateToProductsTitle = By.xpath("//div[@class='item-box']//h2");


        public void verifyEachProductShouldHaveATitle()
        {

            List<WebElement> productTitleElementList = driver.findElements(_navigateToProductsTitle);


            for (WebElement element : productTitleElementList)
            {
                Assert.assertNotNull(element.getText(),"one of the product missing title");
            }

        }
























}

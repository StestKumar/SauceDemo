package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utility
{
    String expectedMsgEqualsActualMsg = loadProp.getProperty("registrationExpectedMessage");

    public void compareActualMsgWithExpectedMessage()
    {

        String actual = getTextOfElement(By.className("result"));
        Assert.assertEquals(actual,expectedMsgEqualsActualMsg,loadProp.getProperty("registrationFailureMessage"));

        //click on log out
        findByElement(By.className("ico-logout"));
    }

}
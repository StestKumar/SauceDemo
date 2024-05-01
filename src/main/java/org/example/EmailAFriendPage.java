package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utility
{
    String expectedMessage =loadProp.getProperty("emailSentMessage");
    public void enterEmailAndMessage()
    {
        //enter friends email to refer the product
        findText(By.id("FriendEmail"),loadProp.getProperty("friendsEmail"));
        //enter your personalised message
        findText(By.id("PersonalMessage"),loadProp.getProperty("personalMessage"));
        //click on send email submit button
        findByElement(By.name("send-email"));
        //variable for actual message created
        String actualMessage = getTextOfElement(By.className("result"));
        //using of assert method to compare actual and expected result
        Assert.assertEquals(actualMessage,expectedMessage, loadProp.getProperty("emailFailureMessage"));
    }
}



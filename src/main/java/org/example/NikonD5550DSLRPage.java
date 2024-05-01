package org.example;

import org.openqa.selenium.By;

public class NikonD5550DSLRPage extends Utility
{   //click on email a friend button
    public void clickOnEmailAFriend()

    {
        findByElement(By.xpath("//button[text()='Email a friend']"));
    }
}

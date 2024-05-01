package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utility
{       //enter details to log-in
    public void enterLoginDetails()
    {   //click on login button
        findByElement(By.className("ico-login"));
        //enter email id
        findText(By.id("Email"),loadProp.getProperty("emailPart1")+ randomDate()+loadProp.getProperty("emailPart2"));
        //enter password
        findText(By.id("Password"), loadProp.getProperty("password"));
        //click on login submit button
        findByElement(By.xpath("//button[@class ='button-1 login-button']"));
    }
}

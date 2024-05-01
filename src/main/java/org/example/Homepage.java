package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utility
{   //click on register button
    public void clickOnRegisterButton()
    {
        findByElement(By.className("ico-register"));
    }
    //click on login button
    public void clickOnLoginButton()
    {
        findByElement(By.className("ico-login"));
    }
    //click on electronics button
    public void clickOnElectronics()
    {
        findByElement(By.xpath("//a[@title='Show products in category Electronics']"));
    }
    //click on build your own computer
    public void clickOnBuildYourOwnComputer()
    {
        findByElement(By.linkText("Build your own computer"));
    }
}



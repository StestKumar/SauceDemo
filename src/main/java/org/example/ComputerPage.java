package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utility
{ private By _clickOnDesktop = By.partialLinkText("Deskto");
    public void clickOnDesktop()
    {
        findByElement(_clickOnDesktop);

    }


}

package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utility
{   //click on the camera and photo on the homepage
    public void clickOnCameraAndPhoto()
    {

        findByElement(By.xpath("//img[@alt='Picture for category Camera & photo']"));

    }
}


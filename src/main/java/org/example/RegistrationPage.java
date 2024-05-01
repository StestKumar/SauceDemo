package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utility {
    //created object for LoadProp
    LoadProp loadProp = new LoadProp();

    public void enterRegistrationDetail() {
        //click on Register Button
        findByElement(By.className("ico-register"));

        //enter the First Name
        findText(By.id("FirstName"), loadProp.getProperty("firstname"));

        //enter the Last Name
        findText(By.id("LastName"), loadProp.getProperty("lastname"));

        //enter Day Of Birth
        selectByVisibleText(By.name("DateOfBirthDay"), loadProp.getProperty("dateOfBirthDay"));

        //enter Month Of Birth
        selectByVisibleText(By.name("DateOfBirthMonth"), loadProp.getProperty("dateOfBirthMonth"));

        //enter Year Of Birth
        selectByVisibleText(By.name("DateOfBirthYear"), loadProp.getProperty("dateOfBirthYear"));

        //enter your Email id
        findText(By.id("Email"), loadProp.getProperty("emailPart1")+randomDate()+loadProp.getProperty("emailPart2"));

        //enter your Password
        findText(By.id("Password"), loadProp.getProperty("password"));

        //confirm Password
        findText(By.id("ConfirmPassword"), loadProp.getProperty("password"));

        //click on the Register Submit Button
        findByElement(By.id("register-button"));

    }
}


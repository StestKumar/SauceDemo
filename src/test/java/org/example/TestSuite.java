package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    Homepage homepage = new Homepage();

    RegistrationPage registrationPage = new RegistrationPage();

    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    LoginPage loginPage = new LoginPage();

    ElectronicsPage electronicsPage = new ElectronicsPage();

    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    NikonD5550DSLRPage nikonD5550DSLRPage = new NikonD5550DSLRPage();

    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void toVerifyUserIsAbleToRegisterSuccessfully()
    {
        homepage.clickOnRegisterButton();

        registrationPage.enterRegistrationDetail();

        registrationResultPage.compareActualMsgWithExpectedMessage();

    }
    @Test
    public void toVerifyUserIsAbleToLoginAndReferAProduct()
    {
        homepage.clickOnRegisterButton();

        registrationPage.enterRegistrationDetail();

        registrationResultPage.compareActualMsgWithExpectedMessage();

        homepage.clickOnElectronics();

        loginPage.enterLoginDetails();

        electronicsPage.clickOnCameraAndPhoto();

        cameraAndPhotoPage.clickOnNikonD5550DSLR();

        nikonD5550DSLRPage.clickOnEmailAFriend();

        emailAFriendPage.enterEmailAndMessage();

    }

    @Test
    public void toVerifyUserIsAbleToBuildYourOwnComputer()
    {
        homepage.clickOnBuildYourOwnComputer();

        buildYourOwnComputerPage.chooseAttributesOfComputer();

        shoppingCartPage.compareShoppingCartMessage();

    }
}

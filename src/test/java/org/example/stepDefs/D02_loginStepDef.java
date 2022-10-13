package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.example.Pages.P02_Login;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_Login Login = new P02_Login();

    @Given("user go to login page")
    public void loginPage()

    {
        Login.LoginLink.click();
    }

     P02_Login EmailUser = new P02_Login();
    @When("user Enter a valid email{string}")
    public void userEnterAValidEmail(String email)

    {
        EmailUser.email().sendKeys(email);
    }


     P02_Login PasswordUser = new P02_Login();
    @And("user Enter a valid Password{string}")
    public void userEnterAValidPassword(String Password)
    {
        PasswordUser.Password().sendKeys(Password);
    }

    P02_Login LoginButtonUser = new P02_Login();
    @And("user press on login button")
    public void LoginButtonuser()
    {
        LoginButtonUser.ButtonOfLogin().click();
    }

    P02_Login MyAccount = new P02_Login();
    @Then("user login to the system successfully")

    public void AccountSuccessfullyLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(MyAccount.UserAccount().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        soft.assertAll();
    }

    @When("user entered an invalid Email{string}")
    public void userEnteredAnInvalidEmail(String Email)
    {
        EmailUser.email().sendKeys(Email);

    }

    @And("user entered an  invalid  password{string}")
    public void userEnteredAnInvalidPassword(String password)
    {
        PasswordUser.Password().sendKeys(password);
    }



    P02_Login UnsuccessfullLogin = new P02_Login();
    @Then("user could not login to the system")

    public void AccountUnSuccessfullyLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(UnsuccessfullLogin.UnsuccessfullyMsg().isDisplayed());
        soft.assertEquals(UnsuccessfullLogin.UnsuccessfullyMsg().getText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
        System.out.println("Login was unsuccessful");
        String red = UnsuccessfullLogin.UnsuccessfullyMsg().getCssValue("color");
        System.out.println(red);
        soft.assertEquals(red,"rgba(228, 67, 75, 1)");

        soft.assertAll();

    }



}

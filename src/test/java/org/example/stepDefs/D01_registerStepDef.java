package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    public static void Selecting(WebElement dropbox,String value)
    {
        Select select = new Select(dropbox);
        select.selectByVisibleText(value);


    }

    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void registerPage()
    {

        register.registerLink.click();


    }

    P01_Register genderButton = new P01_Register();

    @And("user select gender type")
    public void setGenderButton()
    {
        genderButton.genderButton().click();

    }

    P01_Register userFirstname = new P01_Register();
    @And("user enter first name")
            public void FirstName()
    {

     userFirstname.FirstName().sendKeys("automation");

    }
    P01_Register userLastname = new P01_Register();
    @And("user enter last name")

    public void LastName()
    {
        userLastname.LastName().sendKeys("tester");

    }

    P01_Register Date = new P01_Register();
    @And("user enter date of birth")

            public void DateOfBirth()
    {

        Selecting(Date.DateOfBirthDay(),"17" );
        Selecting(Date.DateOfBirthMonth(),"May" );
        Selecting(Date.DateOfBirthYear(), "1987");

    }


    P01_Register userEmail = new P01_Register();
    @And("user enter email \"test@example.com\" field")

    public void Email()
    {
        userEmail.Email().sendKeys("test@example.com");

    }
      P01_Register userPassword = new P01_Register();
    @And("user fills Password")

    public void Password()
    {

        userPassword.Password().sendKeys("P@ssw0rd");

    }
    P01_Register ConfirmationPassword = new P01_Register();
    @And("user fills confirm password")
    public void ConfirmPassword()
    {
        ConfirmationPassword.ConfirmPassword().sendKeys("P@ssw0rd");

    }
    P01_Register RegistrationButton = new P01_Register();
    @And("user clicks on register button")
    public void RegisterButton()
    {
        RegistrationButton.RegisterButton().click();

    }
    P01_Register ConfirmMsg = new P01_Register();
    @Then("success message is displayed")

    public void ConfirmMsgTemplate()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(ConfirmMsg.ConfirmationMsg().isDisplayed());
        soft.assertEquals(ConfirmMsg.ConfirmationMsg().getText(),"Your registration completed");
        String Green = ConfirmMsg.ConfirmationMsg().getCssValue("color");
        System.out.println(Green);
        soft.assertEquals(Green,"rgba(76, 177, 124, 1)");

        soft.assertAll();






    }



}

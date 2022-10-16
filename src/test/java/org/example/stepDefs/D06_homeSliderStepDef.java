package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSliderStepDef {

    P03_homepage FirstSlider = new P03_homepage();
    @When("user click on Nokia Lumia Slider")
    public void NukiaLumia1020()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        FirstSlider.FirstTab().click();



    }

    @Then("user navigate to Nokia page")
    public void NukiaPageurl()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");


    }

    P03_homepage SecondSlider = new P03_homepage();
    @When("user click on I-Phone Slider")
    public void IPhoneSlider()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        SecondSlider.SecondTab().click();


    }
    @Then("user navigate to I-Phone page")
    public void Iphoneurl()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");


    }

}

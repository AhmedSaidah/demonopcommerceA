package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {

    P03_homepage FacebookLink = new P03_homepage();
    @When("user opens facebook link")
    public void FacebookIcon()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        FacebookLink.Facebookicon().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("New Tab {string} should be opened")
    public void newTabShouldBeOpened(String link)
    {


        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),(link));

        Hooks.driver.close();

    }

    P03_homepage TwitterIcon = new P03_homepage();
    @When("user opens twitter link")
    public void TwitterPageIcon()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        TwitterIcon.Twittericon().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    }

    P03_homepage ResoursIcon = new P03_homepage();
    @When("user opens rss link")
    public void RessIconPage()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        ResoursIcon.Rssicon().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    }

    P03_homepage YoutubeIcon = new P03_homepage();
    @When("user opens youtube link")
    public void YoutubeIconPage ()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        YoutubeIcon.TubeIcon().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


    }

}

package org.example.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {

    public P02_Login() {

        PageFactory.initElements(Hooks.driver, this);


    }
    @FindBy(className = "ico-login")
    public WebElement LoginLink;


    public WebElement email()
    {
        return Hooks.driver.findElement(By.cssSelector("#Email"));

    }

    public WebElement Password()
    {
        return Hooks.driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement ButtonOfLogin()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }

    public WebElement UserAccount()
    {
      return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }

    public WebElement UnsuccessfullyMsg()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }
}

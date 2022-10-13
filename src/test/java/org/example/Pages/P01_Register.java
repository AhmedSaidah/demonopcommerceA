package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_Register {

   public  P01_Register()
   {
       PageFactory.initElements(Hooks.driver, this);

   }

   @FindBy(className = "ico-register")
    public WebElement registerLink;


   public WebElement genderButton()
   {


       return Hooks.driver.findElement(By.cssSelector("#gender-male"));


   }

   public WebElement FirstName()
   {

       return Hooks.driver.findElement(By.cssSelector("#FirstName"));
   }

   public WebElement LastName()
   {

       return Hooks.driver.findElement(By.cssSelector("#LastName"));

   }
   public WebElement DateOfBirthDay()
   {
       return Hooks.driver.findElement(By.name("DateOfBirthDay"));


   }
    public WebElement DateOfBirthMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));


    }
    public WebElement DateOfBirthYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));


    }


   public WebElement Email()
   {

       return Hooks.driver.findElement(By.cssSelector("#Email"));

   }

   public WebElement Password()
   {

       return Hooks.driver.findElement(By.cssSelector("#Password"));

   }

   public WebElement ConfirmPassword()
   {

       return Hooks.driver.findElement(By.cssSelector("#ConfirmPassword"));
   }

   public WebElement RegisterButton()
   {
       return Hooks.driver.findElement(By.cssSelector("#register-button"));

   }

   public WebElement ConfirmationMsg()
   {

       return Hooks.driver.findElement(By.className("result"));

   }





}

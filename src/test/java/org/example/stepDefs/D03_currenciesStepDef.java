package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

public class D03_currenciesStepDef {

   P03_homepage Currencies = new P03_homepage();
   @When("user Click to droplist currency changer")
   public void userClickToDroplistCurrencyChanger()
   {
      Currencies.Currency().click();

   }
   P03_homepage Euro = new P03_homepage();
   @And("Click on Euro currency")
   public void eurocurrncy()
   {
      Euro.EuroCurrency().click();

   }

   P03_homepage showencurrency = new P03_homepage();
   @Then("Currencies should be changed to Euro")
   public void eurocurrencyshowen()
   {

     Assert.assertTrue(showencurrency.CurrnciesShowen().isDisplayed());


   }

   P03_homepage ShowElements = new P03_homepage();
   @And("Elements should be shown")
   public void ShowProudctElements()
   {


      List<WebElement> temp = ShowElements.ProductElement();
      for (WebElement element : temp)
      {
         System.out.println("null:" + element.getText());
         String PriceShown = element.getText();
         Assert.assertEquals(PriceShown.contains("€"), true);




      }


   }



}

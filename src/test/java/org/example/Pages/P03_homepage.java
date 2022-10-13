package org.example.Pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homepage {

public P03_homepage()
{

    PageFactory.initElements(Hooks.driver, this);

}
  public WebElement Currency()
  {

      return Hooks.driver.findElement(By.cssSelector("#customerCurrency"));
  }

  public WebElement EuroCurrency()
  {
      return Hooks.driver.findElement(By.cssSelector("#customerCurrency > option:nth-child(2)"));
  }
  public WebElement CurrnciesShowen()
  {

      return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
  }

      public List<WebElement> ProductElement()
      {
          return Hooks.driver.findElements(By.cssSelector(".price.actual-price"));


      }

      public WebElement SearchBar()
      {
          return Hooks.driver.findElement(By.id("small-searchterms"));
      }

      public WebElement SearchButton()
      {

          return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button"));
      }

      public List<WebElement>SearchProductElements()
      {

          return Hooks.driver.findElements(By.cssSelector(".product-item"));
      }

      public WebElement ClickOnProduct()
      {

          return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[1]/a/img"));
      }




      public WebElement SearchProudctsku()
      {

          return Hooks.driver.findElement(By.cssSelector(".sku"));
      }

      public WebElement Hovering()
      {
          return Hooks.driver.findElement(By.linkText("Computers"));

      }
      public WebElement SubCategory()
      {

          return Hooks.driver.findElement(By.linkText("Desktops"));
      }
      public WebElement PageTitle()
      {
          return Hooks.driver.findElement(By.cssSelector(".page-title"));
      }


}

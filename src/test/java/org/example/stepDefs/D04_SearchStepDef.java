package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

public class D04_SearchStepDef {

        P03_homepage search = new P03_homepage();
        @When("user enter product name on search bar {string}")
        public void userEnterProductNameOnSearchBar(String serial)
        {

            search.SearchBar().sendKeys(serial);

        }

        P03_homepage SearchButton = new P03_homepage();
        @And("click on search button")
        public void ClickSearchButton()
        {
                SearchButton.SearchButton().click();
        }

        P03_homepage ProductSearchResult = new P03_homepage();
        @Then("proudct{string} should be shown")
        public void proudctShouldBeShown(String Product)
                {

                        List<WebElement> temp = ProductSearchResult.SearchProductElements();
                        System.out.println("null:" + temp.size());
                        SoftAssert soft = new SoftAssert();
                        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
                        for (WebElement element : temp)
                        {
                                System.out.println("null:" + element.getText());
                                String ProductShown = element.getText().toLowerCase();
                                soft.assertEquals(ProductShown.contains(Product), true);
                        }
                        soft.assertAll();
                }
                        P03_homepage clickonproduct = new P03_homepage();
                        @And("user click on product")
                        public void UserClickonProduct()
                        {
                                clickonproduct.ClickOnProduct().click();
                        }
                      P03_homepage SkuSearchResult = new P03_homepage();
                      @Then("sku{string} should be shown")
                      public void skuShouldBeShown(String Sku)
                      {

                              Assert.assertEquals(SkuSearchResult.SearchProudctsku().getText().contains(Sku),true);

                      }
}


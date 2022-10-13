package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {

    P03_homepage hover = new P03_homepage();
    @When("user hover on Computers category")
    public void UserHoverOnCategory()
    {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(hover.Hovering()).perform();
    }
    P03_homepage ChooseSubCategory = new P03_homepage();
    @And("user click on sub-category")
    public void desktops()
    {


          ChooseSubCategory.SubCategory().click();

    }
    P03_homepage title = new P03_homepage();
    @Then("Sub-category page should be shown")
    public void ResultPageTitle()
    {

        String Page = title.PageTitle().getText().toLowerCase().trim();
         Assert.assertEquals(Page,"desktops");

    }



    }



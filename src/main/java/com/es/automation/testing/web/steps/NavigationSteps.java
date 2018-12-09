package com.es.automation.testing.web.steps;

import com.es.automation.testing.context.SiteContext;
import com.es.automation.testing.web.pages.HomePage;
import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by RAVIVARMANS on 08/12/2018.
 */
public class NavigationSteps {

    @Inject
    public HomePage homePage;

    public static SiteContext siteContext;


    @Given("^I am EuroSport Shop Customer$")
    public void OnHomePage() throws Throwable {
        homePage.load();
    }

    @When("^accessing Road Cycling Navigation Shop section$")
    public void accessing_Road_Cycling_Navigation_Shop_section() throws Throwable {
        siteContext.navigationLinks = homePage.getNavigationDetails();
    }

    @Then("^the Road Cycling Navigation details are displayed$")
    public void the_Road_Cycling_Navigation_details_are_displayed(List<String> navigationLists) throws Throwable {
        assertTrue(navigationLists.equals(siteContext.navigationLinks));
    }
}

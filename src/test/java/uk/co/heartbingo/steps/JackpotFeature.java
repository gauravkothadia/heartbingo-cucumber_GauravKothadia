package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.ResultPage;

public class JackpotFeature {
    @Given("user is on the home page and accepts the cookie consent")
    public void userIsOnTheHomePageAndAcceptsTheCookieConsent() {
        new HomePage().clickOnAcceptAllButton();
    }

    @When("user click on the Categories link")
    public void userClickOnTheCategoriesLink() {
        new HomePage().clickOnCategoriesLink();
    }

    @And("user selects on features tag called {string}")
    public void userSelectsOnFeaturesTagCalled(String featureTag) {
        new HomePage().clickOnCasinoFilterTagNamed(featureTag);
    }



    @Then("user is landed on results page with heading {string}")
    public void userIsLandedOnResultsPageWithHeading(String resultHeading) {
        Assert.assertTrue(new ResultPage().getHeaderText().contains(resultHeading));
    }

    @And("selected category displayed is {string}")
    public void selectedCategoryDisplayedIs(String featureTag) {
        Assert.assertTrue(new ResultPage().getFeatureText().contains(featureTag));
    }

    @And("user click on button showing {string}")
    public void userClickOnButtonShowing(String buttonText) {
        new HomePage().clickOnButtonNamed(buttonText);
    }
}

package uk.co.heartbingo.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.heartbingo.pages.HomePage;

public class LoginLinkSteps {

    @Then("user is able to verify login popup page with session text {string}")
    public void user_is_able_to_verify_login_popup_page_with_session_text(String messageText) {
        new HomePage().switchingToLoginFrame();
        Assert.assertEquals(new HomePage().getLoginFrameText(), messageText);
    }

    @When("user click on link showing {string}")
    public void user_click_on_link_showing(String linkContainingText) {
        new HomePage().clickingOnLoginLink(linkContainingText);
    }

}

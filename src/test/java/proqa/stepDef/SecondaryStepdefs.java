package proqa.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import proqa.pages.SecondaryMenu;
import proqa.stepDef.Base;

public class SecondaryStepdefs extends Base {

    SecondaryMenu secondaryMenu = new SecondaryMenu();

    @Given("User is on home page")
    public void userIsOnHomePage() {
    }

    @When("user clicks to “email” address")
    public void userClicksToEmailAddress() {
        click(secondaryMenu.email);
        textIsDisplayedAndEnabled("info@proqa.dev", secondaryMenu.emailtext);
    }

    @Then("user verifies that default email editor is opened")
    public void userVerifiesThatDefaultEmailEditorIsOpened() {

    }

    @When("User verifies that address “Chicago, IL“ is displayed on the home page")
    public void userVerifiesThatAddressChicagoILIsDisplayedOnTheHomePage() {
        textIsDisplayedAndEnabled("Chicago, IL" , secondaryMenu.address);

    }

    @When("User clicks to “Twitter“ icon")
    public void userClicksToTwitterIcon() {
        click(secondaryMenu.twitter);
        waitSomeTime(500L);
        textIsDisplayedAndEnabled("ProQA", secondaryMenu.twittertext);
    }

    @Then("User verifies that Twitter page is opened")
    public void userVerifiesThatTwitterPageIsOpened() {
    }

    @When("User clicks to “Linkedin“ icon")
    public void userClicksToLinkedinIcon() {
    }

    @Then("User verifies that Linkedin page is opened")
    public void userVerifiesThatLinkedinPageIsOpened() {
    }


}

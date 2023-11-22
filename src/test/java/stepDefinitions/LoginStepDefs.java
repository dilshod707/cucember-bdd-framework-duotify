package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class LoginStepDefs {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        LoginPage loginPage = new LoginPage();
        loginPage.getLoginButton().click();

    }

    @When("User enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String string, String string2) {
        LoginPage loginPage = new LoginPage();
        loginPage.getLoginButton().click();
        loginPage.getUsernameField().sendKeys(ConfigReader.getProperty("username"));
        loginPage.getPassword().sendKeys(ConfigReader.getProperty("password"));
        loginPage.getSignInButton().click();

    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {

        LoginPage loginPage = new LoginPage();
        loginPage.getSignInButton().click();
        SeleniumUtils.waitFor(2);
    }


    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        Assert.assertEquals("Spotify - Web Player: Music for everyone", Driver.getDriver().getTitle());
        SeleniumUtils.waitFor(3);
    }

    @When("User enters invalid username {string} and password {string}")
    public void userEntersInvalidUsernameAndPassword(String arg0, String arg1) {
        LoginPage loginPage = new LoginPage();
        loginPage.getLoginButton().click();
        loginPage.getUsernameField().sendKeys(ConfigReader.getProperty("username"));
        loginPage.getPassword().sendKeys(ConfigReader.getProperty("password"));
        loginPage.getSignInButton().click();

    }

    @Then("User should get error message")
    public void userShouldGetErrorMessage() {

    }


//
//    @Then("User should get error message")
//    public void userShouldGetErrorMessage() {
//        Assert.assertEquals("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F",
//                Driver.getDriver().getCurrentUrl());
////        Assert.assertTrue(new LoginPage().getInvalidCredentials().isDisplayed());
//    }


}

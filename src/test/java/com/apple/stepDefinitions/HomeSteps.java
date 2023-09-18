package com.apple.stepDefinitions;

import com.apple.POM.HomePage;
import com.apple.Utils.Driver;
import com.apple.Utils.PropertiesFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeSteps {

    HomePage homePage= new HomePage();

    @Given("the application {string}")
    public void the_application(String url) throws IOException {
        Driver.setUp(PropertiesFile.getProperty(url));
    }
    @When("user clicks on Menu item")
    public void user_clicks_on_menu_item() {

        homePage.clickOnMenu();
    }

    @And("user clicks on Store link")
    public void userClicksOnStoreLink() {
        homePage.clickOnStore();

    }

    @And("user clicks on iPad subLink")
    public void userClicksOnIPadSubLink() {
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        homePage.clickOniPadSubLink();

    }

    @Then("user verify Shop iPad text on UI screen")
    public void userVerifyShopIPadTextOnUIScreen() {
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        homePage.getShopiPadText();
    }

    @And("user clicks on MAC link")
    public void userClicksOnMACLink() {
        homePage.clickOnMACSubLink();


    }

    @And("user clicks on Explore All Mac subLink")
    public void userClicksOnExploreAllMacSubLink() {
        homePage.clickOnExploreAllMacLink();

    }

    @Then("user verify MacBook Air text on UI screen")
    public void userVerifyMacBookAirTextOnUIScreen() {
        homePage.getMacBookAirText();

    }

    @And("user clicks on TV & Home link")
    public void userClicksOnTVHomeLink() {
        homePage.clickOnTVAndHomeLink();
    }

    @And("user clicks on Apple TV 4K subLink")
    public void userClicksOnAppleTVKSubLink() {
        homePage.ClickOnAppleTV4KLink();
    }
}

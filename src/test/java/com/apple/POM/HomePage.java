package com.apple.POM;

import com.apple.Utils.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    private By menu= AppiumBy.cssSelector("button#globalnav-menutrigger-button");
    private By store= AppiumBy.cssSelector("#globalnav-list > li.globalnav-item.globalnav-menu.globalnav-item-flyout-open > div > div > div.globalnav-item.globalnav-item-store.globalnav-item-menu.globalnav-item-submenu > ul > li:nth-child(1) > a > span.globalnav-link-text-container");

    private By iPad=AppiumBy.cssSelector(" #globalnav-submenu-link-store > div > div > div.globalnav-submenu-group.globalnav-submenu-group-elevated > ul > li:nth-child(3) > a");
    private By shop_iPadText=AppiumBy.cssSelector("#page > div.rs-step0 > div.as-l-container.rs-shop-container.rs-shop-container-withchatandstore > div > div.column.large-8.small-12.rs-shop-header-section > h1");

    private By mac=AppiumBy.cssSelector("#globalnav-list > li.globalnav-item.globalnav-menu.globalnav-item-flyout-open > div > div > div.globalnav-item.globalnav-item-mac.globalnav-item-menu.globalnav-item-submenu > ul > li:nth-child(1) > a > span.globalnav-link-text-container");
    private By exploreAllMacLink=AppiumBy.cssSelector("#globalnav-submenu-link-mac > div > div > div.globalnav-submenu-group.globalnav-submenu-group-elevated > ul > li:nth-child(1) > a");

    private By verifyMacBookAir=AppiumBy.cssSelector("#main > section.section.section-macbook-air.section-hero-product > div > div > h2 > span.typography-hero-product-headline.hero-eyebrow");

    private By clickOnTVAndHome=AppiumBy.cssSelector("#globalnav-list > li.globalnav-item.globalnav-menu.globalnav-item-flyout-open > div > div > div.globalnav-item.globalnav-item-tv-home.globalnav-item-menu.globalnav-item-submenu > ul > li:nth-child(1) > a > span.globalnav-link-text-container");

    private By AppleTV4KLink=AppiumBy.cssSelector("#globalnav-submenu-link-tv-home > div > div > div.globalnav-submenu-group.globalnav-submenu-group-elevated > ul > li:nth-child(2) > a");
    public void clickOnMenu(){
        Driver.driver.findElement(menu).click();
    }

    public void clickOnStore(){
        Driver.driver.findElement(store).click();
    }

    public void clickOniPadSubLink(){
        Driver.driver.findElement(iPad).click();
    }

    public void getShopiPadText(){
        String value=Driver.driver.findElement(shop_iPadText).getText();
        System.out.println(value);
    }

    public void clickOnMACSubLink(){

        Driver.driver.findElement(mac).click();
    }


    public void clickOnExploreAllMacLink(){
        Driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        Driver.driver.findElement(exploreAllMacLink).click();

    }

    public void getMacBookAirText(){
       String value= Driver.driver.findElement(verifyMacBookAir).getText();
        System.out.println(value);
    }

    public void clickOnTVAndHomeLink(){
        Driver.driver.findElement(clickOnTVAndHome).click();

    }

    public void ClickOnAppleTV4KLink(){
        Driver.driver.findElement(AppleTV4KLink).click();
    }

}

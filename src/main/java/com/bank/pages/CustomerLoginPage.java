package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerName;
    @CacheLookup
    @FindBy(xpath = "//option[@value='12']")
    WebElement selectCustomer;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement clickLogin;


    public void clickOnCustomerName() {
        clickOnElement(customerName);
    }

    public void selectTheCustomerNameFromDropDown() {
        selectByVisibleTextFromDropDown(selectCustomer, "Rita Smith");
    }

    public void clickOnLoginForCustomer() {
        clickOnElement(clickLogin);
    }

}

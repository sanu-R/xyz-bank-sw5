package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameText;




    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }

    public void clickOnCustomerLogin() {
        clickOnElement(customerLogin);
    }

    public String verifyYourNameText() {
        return getTextFromElement(yourNameText);


    }


}

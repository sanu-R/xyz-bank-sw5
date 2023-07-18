package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement verifyLogoutTab;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutCustomer;





    public void enterOnLogoutOnCustomerPage() {
        clickOnElement(logoutCustomer);
    }

    public String checkLogOutText() {
        return getTextFromElement(verifyLogoutTab);


    }



}

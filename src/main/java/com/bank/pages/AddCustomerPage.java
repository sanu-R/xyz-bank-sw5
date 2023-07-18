package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement  postCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement   customerAdd;


    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }


    public void enterLastName(String name) {
        sendTextToElement(lastName,name);
    }


    public void enterThePostCode(String code) {
        sendTextToElement(postCode,code);
    }

    public void EnterKeyOnAddCustomer() {
        clickOnElement(customerAdd);
    }

    public void getTextFromPopUp() {
        getTextFromAlert();
    }

    public void popUpWindow() {
        acceptAlert();
    }

}

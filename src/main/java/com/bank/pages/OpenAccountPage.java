package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomerName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement findCustomer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement process;








    public void clickOnCusterNameDropDown() {
        clickOnElement(searchCustomerName);
    }

    public void selectOnCusterNameDropDownToSeeName(String customerN) {
        selectByVisibleTextFromDropDown(findCustomer,customerN );
    }

    public void clickOnCurrency() {
        clickOnElement(currency);
    }

    public void selectTheCurrency(String selectOne) {

        selectByVisibleTextFromDropDown(selectCurrency,selectOne);
    }

    public void clickOnProcessButton() {
        clickOnElement(process);
    }

    public void getTextFormOpenAccountPopUp() {
        getTextFromAlert();
    }

    public void clickOkONOpenAccountPopUp() {
        acceptAlert();
    }


}

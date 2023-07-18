package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount ;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement  clickDeposit;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement successfulDeposit;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawal ;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterWithdrawal;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement clickWithdrawal;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement  transaction;




    public void enterOnDepositButton() {
        clickOnElement(deposit);
    }

    public void enterDepositAmount(String figure) {
        sendTextToElement(amount,figure);
    }

    public void clickOnDepositButton() {
        clickOnElement(clickDeposit);
    }

    public String checkDepositSuccessful() {
        return getTextFromElement(successfulDeposit);


    }

    public void withdrawalMoney() {
        clickOnElement(withdrawal);
    }

    public void enterMoneyWithdrawal(String enterAmount) {
        sendTextToElement(enterWithdrawal,enterAmount);
    }

    public void enterWithdrawalButton() {
        clickOnElement(clickWithdrawal);
    }

    public String verifyTheTransactionText() {
        return getTextFromElement(transaction);


    }


}

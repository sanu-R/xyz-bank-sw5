package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;
    @BeforeMethod (alwaysRun = true)
    public void inIt() {
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        homePage = new HomePage();
       openAccountPage = new OpenAccountPage();

    }

    @Test(groups = {"sanity","regression"})

    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        // click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        Thread.sleep(2000);
        //	click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();
        Thread.sleep(2000);
        //	enter FirstName
        addCustomerPage.enterFirstName("Rita");
        Thread.sleep(2000);
        //	enter LastName
        addCustomerPage.enterLastName("Smith");
        Thread.sleep(2000);
        //	enter PostCode
        addCustomerPage.enterThePostCode("SM1 5DD ");
        Thread.sleep(2000);
        //	click On "Add Customer" Button
        addCustomerPage.EnterKeyOnAddCustomer();
        Thread.sleep(2000);
        //	popup display verify message "Customer added successfully"
        addCustomerPage.getTextFromPopUp();
        Thread.sleep(2000);
        //	click on "ok" button on popup
        addCustomerPage.popUpWindow();
        Thread.sleep(2000);
    }

    @Test(groups = {"sanity", "smoke","regression"})

    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        Thread.sleep(1000);
        //	click On "Open Account" Tab
        Thread.sleep(1000);
        bankManagerLoginPage.clickOnOpenAccount();
        //	Search customer that created in first test
        openAccountPage.clickOnCusterNameDropDown();
        Thread.sleep(1000);
        openAccountPage.selectOnCusterNameDropDownToSeeName("Ron Weasly");
        //	Select currency "Pound"
        openAccountPage.clickOnCurrency();
        Thread.sleep(1000);
        openAccountPage.selectTheCurrency("Pound");
        Thread.sleep(1000);
        //	click on "process" button
        openAccountPage.clickOnProcessButton();
        Thread.sleep(1000);
        //	verify message "Account created successfully"
        openAccountPage.getTextFormOpenAccountPopUp();
        //	click on "ok" button on popup.
        openAccountPage.clickOkONOpenAccountPopUp();


    }

    @Test(groups = {"smoke","regression"})

    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        //	search customer that you created.
        customerLoginPage.clickOnCustomerName();
        Thread.sleep(1000);
        openAccountPage.selectOnCusterNameDropDownToSeeName("Ron Weasly");
        Thread.sleep(1000);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginForCustomer();
        Thread.sleep(1000);
        //	verify "Logout" Tab displayed.
        Assert.assertEquals(customersPage.checkLogOutText(),"Logout","Text is not displayed");
        Thread.sleep(1000);
        //	click on "Logout"
        customersPage.enterOnLogoutOnCustomerPage();
        Thread.sleep(1000);
        // verify "Your Name" text displayed.
        Assert.assertEquals(homePage.verifyYourNameText(),"Your Name","Text is not displayed");



    }

    @Test(groups = {"regression"})

    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        //	search customer that you created.
        customerLoginPage.clickOnCustomerName();
        Thread.sleep(1000);
        openAccountPage.selectOnCusterNameDropDownToSeeName("Ron Weasly");
        Thread.sleep(1000);
        //	click on "Login" Button
        customerLoginPage.clickOnLoginForCustomer();
        Thread.sleep(1000);
        //	click on "Deposit" Tab
        accountPage.enterOnDepositButton();
        Thread.sleep(1000);
        //	Enter amount 100
        accountPage.enterDepositAmount("100");
        Thread.sleep(1000);
        //	click on "Deposit" Button
        accountPage.clickOnDepositButton();
        Thread.sleep(1000);
        //	verify message "Deposit Successful"
        Assert.assertEquals(accountPage.checkDepositSuccessful(),"Deposit Successful","Text not found");

        Thread.sleep(1000);

    }


    @Test(groups = {"regression"})

    public void customerShouldWithdrawMoneySuccessfully() {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //	search customer that you created.
        customerLoginPage.clickOnCustomerName();
        openAccountPage.selectOnCusterNameDropDownToSeeName("Ron Weasly");
        //	click on "Login" Button
        customerLoginPage.clickOnLoginForCustomer();
        //	click on "Withdrawal" Tab
        accountPage.withdrawalMoney();
        //	Enter amount 50
        accountPage.enterMoneyWithdrawal("50");
        //	click on "withdrawal" Button
        accountPage.enterWithdrawalButton();
        //	verify message "Transaction Successful"
        Assert.assertEquals(accountPage.verifyTheTransactionText(),"Transaction successful","Text not found");
      
    }


}
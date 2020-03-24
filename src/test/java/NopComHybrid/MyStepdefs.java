package NopComHybrid;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs

{   HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
    ConfirmPage confirmPage = new ConfirmPage();
    DegitalDownloadPage degitalDownloadPage = new DegitalDownloadPage();
    News news = new News();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
    PaymentPage paymentPage = new PaymentPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsAGuestPage checkoutAsAGuestPage = new CheckoutAsAGuestPage();


 //guest user checkout feature................................................

    @Given("guest user is on the Nopcommerce homepage")
    public void guestUserIsOnTheNopcommerceHomepage()
    {
        homePage.verifyUserIsOnHOmePage();
    }

    @When("guest user click on Digitaldownlod button")
    public void guestUserClickOnDigitaldownlodButton()
    {
        homePage.clickOnDigitalDownloadsCategory();

    }

    @And("guest user can click on add to cart")
    public void guestUserCanClickOnAddToCart() {
        degitalDownloadPage.clickOnAddToCartButton();
    }

    @And("guest user can click on shipping cart")
    public void guestUserCanClickOnShippingCart() {
        degitalDownloadPage.clickOnShoppingCart();
    }

    @And("guest user can tick on terms box")
    public void guestUserCanTickOnTermsBox() {
        shoppingCartPage.clickOnTickBox();
    }

    @And("guest user can click on checkout")
    public void guestUserCanClickOnCheckout() {
        shoppingCartPage.clickOnCheckoutButton();
    }

    @And("guest user can click on checkout as guest")
    public void guestUserCanClickOnCheckoutAsGuest()
    {
        checkoutAsAGuestPage.clickOCheckoutAsGuestButton();

    }

    @And("guest user can enter all compulsory field")
    public void guestUserCanEnterAllCompulsoryField()
    {
        onePageCheckoutPage.fillInAllCompulsoryFields();
    }

    @And("guest user can click o n continue")
    public void guestUserCanClickONContinue()
    {
        onePageCheckoutPage.selectContinueButton();
    }

    @And("guest user can Enter Payment information")
    public void guestUserCanEnterPaymentInformation()
    {
        paymentPage.selectAndFillCreditCardDetails();
    }

    @And("guest user can click on payment button")
    public void guestUserCanClickOnPaymentButton()
    {
        paymentPage.paymentContinueButton();
    }

    @And("guest user can click on conform button")
    public void guestUserCanClickOnConformButton()
    {
        confirmPage.clickOnConfirm();
    }

    @Then("guest user can buy product successfully and see message")
    public void guestUserCanBuyProductSuccessfullyAndSeeMessage()
    {
        checkoutCompletePage.verifyOrderSuccessMessage();
    }
    // cart button present feature..............................................................
    @Given("I am on the NopeCommerce  homepage")
    public void iAmOnTheNopeCommerceHomepage() {
    }

    @Then("I also could have see add to cart button in all")
    public void iAlsoCouldHaveSeeAddToCartButtonInAll() {
        homePage.checkAddToCartButtonOnAllProducts();
    }
  // change currency feature.....................................................................
    @When("I change currency to USD")
    public void iChangeCurrencyToUSD()
    {
        homePage.selectCurrencyFromDropDown();
    }

    @Then("I can see all the prices have change to USD")
    public void iCanSeeAllThePricesHaveChangeToUSD()
    {
        homePage.verifyingCurrencySymbolPresent();
    }
// guest user add comment...................................................................
    @When("I navigate to new comments")
    public void iNavigateToNewComments()
    {
        news.userNavigateToFirstDetailOnNews();
    }

    @And("I fills comment fields")
    public void iFillsCommentFields()
    {
        news.addNewComment();
    }

    @And("I click on new comment button")
    public void iClickOnNewCommentButton()
    {
        news.submitNewComment();

    }

    @Then("comment should be added and message display <News comment is successfully added.>")
    public void commentShouldBeAddedAndMessageDisplayNewsCommentIsSuccessfullyAdded()
    {
        news.verifyNewCommentAddedSuccessfully();
    }
}

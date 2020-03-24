package NopComHybrid;

import org.openqa.selenium.By;

public class CheckoutAsAGuestPage extends Utils
{
    private By _checkoutAsGuestButton = By.xpath("//input[@onclick='location.href=\"/checkout\"']");
    public void verifyUserShouldOnCheckoutAsAGuestPage()
    {
        assertURL("checkoutasguest");
    }

    public void clickOCheckoutAsGuestButton()
    {
        clickOnElement(_checkoutAsGuestButton);
    }

}

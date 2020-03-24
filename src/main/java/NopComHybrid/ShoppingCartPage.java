package NopComHybrid;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils
{
    private By _tickBox = By.xpath("//input[@id='termsofservice']");
    private By _checkOutButton = By.xpath("//button[@class='button-1 checkout-button']");
    public void verifyUserShouldOnShoppingCartPage()
    {
        assertURL("cart");
    }

    public void clickOnTickBox()
    {   sleep(5);
        clickOnElement(_tickBox);
    }

    public void clickOnCheckoutButton()
    {
        scrollAndClick(_checkOutButton);
    }
}

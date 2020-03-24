package NopComHybrid;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DegitalDownloadPage extends Utils{
        private By _addToCartButton = By.xpath("//input[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/34/1/1\"),!1']");
        private By _shoppingCartButton = By.className("cart-label");
        public  void verifyUserShouldOnDigitalDownloadsPage()
        {
            assertURL("digital-downloads");

        }

        public void clickOnAddToCartButton()
        {
            clickOnElement(_addToCartButton);
        }

        public void clickOnShoppingCart()
        {
            clickOnElement(_shoppingCartButton);
        }

}

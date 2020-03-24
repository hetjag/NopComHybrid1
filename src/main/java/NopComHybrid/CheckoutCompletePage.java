package NopComHybrid;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutCompletePage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _continueONCheckoutButton = By.xpath("//input[@onclick='setLocation(\"/\")']");
    private By _successMsgField = By.xpath("//div[@class=\"section order-completed\"]/div/strong");


    public void verifyOrderSuccessMessage(){
        waitForClickable(_continueONCheckoutButton,10);
        Assert.assertEquals(getTextElement(_successMsgField),loadProp.getProperty("CheckoutSuccessMsg"),"Success message is not displayed");
    }
}

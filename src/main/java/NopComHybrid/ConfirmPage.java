package NopComHybrid;

import org.openqa.selenium.By;

public class ConfirmPage extends Utils
{

    private By _confirmButton = By.xpath("//input[@onclick='ConfirmOrder.save()']");

    public void clickOnConfirm(){
        waitForClickable(_confirmButton,10);
        clickOnElement(_confirmButton);
    }
}

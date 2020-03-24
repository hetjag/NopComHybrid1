package NopComHybrid;

import org.openqa.selenium.By;

public class PaymentPage extends Utils {
    private By _creditCard = By.xpath("//input[@id='paymentmethod_1']");
    private By _savePayementTypeContinueButton = By.xpath("//input[@onclick='PaymentMethod.save()']");
    private By _savePayementInfoContinueButton = By.xpath("//input[@onclick='PaymentInfo.save()']");
    private By _selecteCardtType =By.id("CreditCardType");
    private By _cardholderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _expireMonth = By.id("ExpireMonth");
    private By _expireYear = By.id("ExpireYear");
    private By _cardCode = By.id("CardCode");


    public void selectAndFillCreditCardDetails()
    {
        clickOnElement(_creditCard);
        clickOnElement(_savePayementTypeContinueButton);
        dropDrownVisibletext(_selecteCardtType, "Master card");
        clearAndEnterText(_cardholderName,"Test Patel");
        clearAndEnterText(_cardNumber,"4111111111111111");

        dropDrownVisibletext(_expireMonth, "12");
        dropDrownVisibletext(_expireYear, "2022");
        clearAndEnterText(_cardCode,"734");




    }



    public void paymentContinueButton(){
        clickOnElement(_savePayementInfoContinueButton);

    }
}

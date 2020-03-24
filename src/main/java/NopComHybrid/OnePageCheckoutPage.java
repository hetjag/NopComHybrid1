package NopComHybrid;

import org.openqa.selenium.By;

public class OnePageCheckoutPage extends Utils
{
    LoadProp loadProp = new LoadProp();
    private By _firsNameOfCheckOut = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private By _lastNameOfCheckOut = By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By _emailOfCheckOut = By.xpath("//input[@id='BillingNewAddress_Email']");
    private By _selectCountryOfCheckOut = By.xpath("//select[@data-url='/country/getstatesbycountryid']");
    private By _cityOfCheckOut = By.xpath("//input[@id='BillingNewAddress_City']");
    private By _addressLineOneOfCheckOut = By.xpath("//input[@id='BillingNewAddress_Address1']");
    private By _postalCodeOfCheckOut = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private By _phoneNumberOfCheckOut = By.id("BillingNewAddress_PhoneNumber");
    private By _continueOfCheckOut = By.xpath("//input[@class='button-1 new-address-next-step-button']");






    private String  firsNameOfCheckOut = "john";
    private String  lastNameOfCheckOut = "saad";
    private String  emailOfCheckOut = "wert@gmail.com";
    private String cityOfCheckOut = "hhhhh";
    private String addressLineOneOfCheckOut = "24 norwy";
    private String postalCodeOfCheckOut = "RT46 78TY";
    private String phoneNumberOfCheckOut = "29999999999";

    public void verifyUserShouldOnOnePageCheckoutPage()
    {
        assertURL("onepagecheckout");
    }

    public void fillInAllCompulsoryFields()
    {
        EnterText(_firsNameOfCheckOut,firsNameOfCheckOut);
        EnterText(_lastNameOfCheckOut ,lastNameOfCheckOut);
        EnterText(_emailOfCheckOut,emailOfCheckOut);
        dropDownIndex(_selectCountryOfCheckOut,158);
        EnterText(_cityOfCheckOut,cityOfCheckOut);
        EnterText(_addressLineOneOfCheckOut,addressLineOneOfCheckOut);
        EnterText(_postalCodeOfCheckOut,postalCodeOfCheckOut);
        EnterText(_phoneNumberOfCheckOut,phoneNumberOfCheckOut);


    }



    public void selectContinueButton()
    {
        clickOnElement(_continueOfCheckOut);

    }



}

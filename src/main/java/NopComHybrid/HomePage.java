package NopComHybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePage extends Utils
{
    LoadProp loadProp = new LoadProp();
    SoftAssert softAssert = new SoftAssert();


    private By _registerLink = By.linkText("Register");
    private By _compareFirstProduct = By.xpath("//div/div[2]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']");
    private By _compareSecondProduct = By.xpath("//div/div[3]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']");
    private By _compareProduct = By.linkText("product comparison");
    private By _displayBarField = By.cssSelector("div.bar-notification.success");
    private By _productClick = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.className("button-2 email-a-friend-button");
    private By _clickOnBook = By.linkText("Books");
    private By _currencyDropDrownMenuField = By.id("customerCurrency");
    private By _itemBoxesField = By.className("product-item");
    private By _addCartButtonField = By.cssSelector("[type='button'][value='Add to cart']");
    private By _productNameField = By.cssSelector("h2.product-title > a");
    private By _digitalDownloadsButton = By.linkText("Digital downloads");
    private By _nopCommerceLink =By.linkText("demo.nopcommerce");
    private By _homePageImage = By.xpath("//img[@alt='nopCommerce demo store']");



    String expectedBeforehover = "#555555";
    String expectedAfterhover = "#4ab2f1";


    public void clickOnDigitalDownloadsCategory()
    {
        clickOnElement(_digitalDownloadsButton);
    }
    public  void verifyUserIsOnHOmePage()
    {
        assertURL("demo.nopcommerce");

    }

    public void selectCurrencyFromDropDown(){
        dropDrownVisibletext(_currencyDropDrownMenuField,loadProp.getProperty("changeToCurrency"));
    }

    public void verifyingCurrencySymbolPresent()
    {
        String selectedCurrencyName = dropDownGetSelectedText(_currencyDropDrownMenuField);
        String currencySymbol =getCurrencySymbolFromCurrencyName(selectedCurrencyName);
        System.out.println("Currently selected currency symbol is : "+currencySymbol);
        List<WebElement> listOfPriceElements = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement element : listOfPriceElements )
        {
            softAssert.assertTrue(element.getText().contains(currencySymbol),"This price does not have selected currency symbol '"+currencySymbol+"' :"+element.getText());
        }
        softAssert.assertAll();
    }

    public String getCurrencySymbolFromCurrencyName(String currencyName)
    {
        switch (currencyName){
            case "US Dollar":
                return "$";
            case "Euro":
                return "Ђ";
            default:
                return "Invalid Currency name";
        }
    }

    public void clickOnRegisterButton()
    {

        clickOnElement(_registerLink);
    }
    public void checkAddToCartButtonOnAllProducts()
    {
        //finding all the items available in homepage
        List<WebElement> listOfItems = driver.findElements(_itemBoxesField);
        int count=0;

        for (WebElement item : listOfItems )
        {

            //finding how many add to cart present in each item by its element
            int cart = item.findElements(_addCartButtonField).size();

            if ((cart==1))
            {
                count++;

            }else
            {
                //get title name of item which does not have add to car button
                System.out.println("NO ADD TO CART BUTTON >>>>>> "+item.findElement(_productNameField).getText());
            }
        }

        //verifying expected add to cart number present with expected numbers
        Assert.assertEquals(count,listOfItems.size(),"Some of items does not have ADD TO CART button");

    }


    public void clickOnDetailsButton()
    {
//        scrollAndClick(By);
    }

    public void navigateToHomepage()
    {
        clickOnElement(_homePageImage);
    }
    public void clickOnCategoryLinks(String category){
        driver.findElement(By.linkText(category)).click();
    }
    public void moveOnElement(String categoryLink){
        WebElement menuOption = driver.findElement(By.linkText(categoryLink));
        //move on computer to perform mouse hover
        // Instantiate Action Class
        sleep(3);
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement(menuOption).build();
        //Storing  color
        String hexActualBeforeHover = Color.fromString(menuOption.getCssValue("color")).asHex();
        System.out.println("Before hover : " + hexActualBeforeHover);
        Assert.assertEquals(hexActualBeforeHover, expectedBeforehover, "Before hover colour is not correct");
        //Mouse hover  menuOption 'computer'
        mouseOverCategory.perform(); }
    public void verifyUserShouldSeeChangeColorOfCategory (String category)
    {
        WebElement menuOption = driver.findElement(By.linkText(category));

        String hexActualAfterHover = Color.fromString(menuOption.getCssValue("color")).asHex();

        System.out.println("After hover : "+ hexActualAfterHover);
        Assert.assertEquals(hexActualAfterHover, expectedAfterhover, "After hover colour is not correct");
    }
    public void clickOnSubCategoryLink(String categoryLink,String subCategoryLink)
    {
        WebElement menuOption = driver.findElement((By.xpath("//div[@class='header-menu']/ul[1]/li/a[contains(.,'"+categoryLink+"')]")));
        WebElement subMenuOption = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li/ul/li/a[contains(.,'"+subCategoryLink+"')]"));
        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder
                .moveToElement(menuOption)
                .click(subMenuOption)
                .build();
        mouseOverCategory.perform();
        sleep(4);
    }
    public void verifyIShouldAbleToNavigateToSubCategoryPageSuccessfully(String subcategory)
    {

        assertURL(subcategory);
    }




}

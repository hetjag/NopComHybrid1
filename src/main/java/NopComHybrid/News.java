package NopComHybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class News extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _detailsButtonNewsPage = By.xpath("//a[@class=\"read-more\"]");
    private  By _newCommentSubmitButton = By.xpath("//input[@name='add-comment']");
    private  By _commentTitleBoxField = By.id("AddNewComment_CommentTitle");
    private  By _commentTextBoxField = By.id("AddNewComment_CommentText");
    private By _commetnSuccessMessageField = By.xpath("//div[@class=\"result\"]");
    String commentTitle = "Test123"+timeStamp();
    String commentMessage = "My personal Message"+timeStamp();
    String commentSuccessMessage = loadProp.getProperty("commentSuccessMessage");


    public void userNavigateToFirstDetailOnNews() {

        clickOnElement(_detailsButtonNewsPage);
        waitForClickable(_newCommentSubmitButton,10);

    }

    public void addNewComment()
    {
        clearAndEnterText(_commentTitleBoxField,commentTitle);
        clearAndEnterText(_commentTextBoxField,commentMessage);
    }

    public void submitNewComment()
    {
        clickOnElement(_newCommentSubmitButton);
        waitForClickable(_newCommentSubmitButton,10);
    }

    public void verifyNewCommentAddedSuccessfully()
    {

        Assert.assertEquals(getTextElement(_commetnSuccessMessageField),commentSuccessMessage,"New comment not added......");

        List<WebElement> listOfCommentsElements= driver.findElements(By.cssSelector("div.comment.news-comment"));

        //finding number of comments
        int numberOfComments =listOfCommentsElements.size();

        //finding last comments text
        String actualComment = listOfCommentsElements.get(numberOfComments-1).getText();

        Assert.assertTrue(actualComment.contains(commentTitle),"Comment is not added at bottom of the page");

    }
}

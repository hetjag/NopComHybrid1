package NopComHybrid;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


import static org.apache.commons.io.FileUtils.copyFile;


public class Hooks extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();
@Before
    public void openBrowser()
{
    browserSelector.setUpBrowser();

}
@After
    public void closeBrowser(Scenario scenario)
    {

        if (scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll(".,:;?!","") + timeStamp() +".png";
            try {
                File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/target/Destination/screenshots/" + screenshotName);
                copyFile(sourcePath,destinationPath);
                scenario.write("!!!!!!......Scenario Failed....!!!!!! Please see attached screenshot for the error/issue");
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        driver.quit();
    }
}

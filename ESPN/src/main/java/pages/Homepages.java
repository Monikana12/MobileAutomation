package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Homepages extends MobileAPI {

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout")
    WebElement layout;

    @FindBy(xpath ="//android.widget.LinearLayout")
    WebElement linear;

    @FindBy(xpath = "//android.widget.ImageView")
    WebElement Image;

    public void uiValidation(){
        sleepFor(5);

        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(layout.isDisplayed(),true,"FrameLayout isn't displayed");
        softAssert.assertEquals(linear.isDisplayed(),true,"LinearLayout isn't displayed");
        softAssert.assertEquals(Image.isDisplayed(),true,"ImageView isn't displayed");
        softAssert.assertAll();

    }
    public void clickAccount(){
        sleepFor(4);
        layout.click();
    }

    public void scrollHomepages(){
        sleepFor(3);
        functionSwipe("up",200,200);
        sleepFor(3);


    }












}

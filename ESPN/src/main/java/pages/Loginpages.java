package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpages extends MobileAPI {

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2")
    WebElement loginField;

    @FindBy(xpath ="")
    WebElement passwordField;

    public void fillUpDate(){
        sleepFor(5);
        loginField.sendKeys("monika");
        passwordField.sendKeys("789089");
    }

}

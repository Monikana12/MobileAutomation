package espnTest;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepages;
import pages.Loginpages;

public class TestsCases extends MobileAPI {

    Homepages homepages;
    Loginpages loginpages;

    @BeforeMethod
    public void init(){
        homepages = PageFactory.initElements(appiumDriver,Homepages.class);
        loginpages =PageFactory.initElements(appiumDriver,Loginpages.class);
    }

    @Test(enabled=false)
    public void testUI(){
        homepages.uiValidation();
    }

    @Test
    public void login(){
        homepages.clickAccount();
        loginpages.fillUpDate();
    }

    @Test
    public void swipeTest(){
        homepages.scrollHomepages();
    }


}

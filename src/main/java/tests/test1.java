package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Constants;

public class test1 {

    private WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() throws Exception{
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.openUrl(Constants.BASEURL);
    }

    @After
    public void afterTest(){
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException{
        loginPage.login(Constants.USER, Constants.PASSWORD);
        Assert.assertTrue(loginPage.successfulLogin());
    }


}

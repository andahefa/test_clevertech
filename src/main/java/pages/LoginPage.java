package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Transversal {
    By inputUsername = By.name("user");
    By inputPassword = By.name("password");
    By btnLogin = By.className("button");
    By lblSuccessfulLogin = By.xpath("//body/center/form[@name='f']/div[@id='available']/table[@id='listing']/tbody/tr[2]/td[4]/input[1]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        sendKeys(username, inputUsername);
        sendKeys(password, inputPassword);
        click(btnLogin);
    }

    public boolean successfulLogin(){
        waitExplicit(lblSuccessfulLogin);
        return isDisplayed(lblSuccessfulLogin);
    }

}

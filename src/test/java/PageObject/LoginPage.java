package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;


/**
 * Created by Alena on 16.05.2016.
 */


public class LoginPage extends AbstractPage {


    private final Logger logger = Logger.getLogger(LoginPage.class.getName());
    private final String BASE_URL = "https://vk.com/";

    @FindBy(id = "quick_email")
    private WebElement inputLogin;

    @FindBy(id = "quick_pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"quick_login_button\"]")
    private WebElement linkEnter;

    @FindBy(xpath = "//*[@id=\"myprofile\"]")
    private WebElement linkLoggedInUser;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        logger.info("Login page opened");
    }

    public void login(String username, String password) {

        inputLogin.sendKeys(username);
        inputPassword.sendKeys(password);
        linkEnter.click();

        logger.info("Login performed");
    }




    public boolean getLoggedInUserName() {
        return linkLoggedInUser.isDisplayed();
    }
}

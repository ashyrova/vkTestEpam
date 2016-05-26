package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

/**
 * Created by Alena on 22.05.2016.
 */
public class LogoutPage extends AbstractPage {
    private final Logger logger = Logger.getLogger(LoginPage.class.getName());
    private final String BASE_URL = "https://vk.com/";

    @FindBy(xpath = "//*[@id=\"logout_link\"]")
    private WebElement exitBtn;

    @FindBy(id = "page_layout")
    private WebElement logout;

    @FindBy(id = "page_header")
    private WebElement enterHeader;

    public LogoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        logger.info("Logout page opened");
    }

    public void logout() {
        exitBtn.click();
        logout.click();

        logger.info("User Logout");
    }

    public boolean getEnterHeader() {
        return enterHeader.isDisplayed();
    }


}

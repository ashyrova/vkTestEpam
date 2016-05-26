package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

/**
 * Created by Alena on 17.05.2016.
 */
public class SearchPage extends AbstractPage {
    private final Logger logger = Logger.getLogger(LoginPage.class.getName());
    private final String BASE_URL = "https://vk.com/friends";

    @FindBy(id = "s_search")
    private WebElement searchField;

    @FindBy(xpath ="//*[@id=\"user_block204902732\"]/div[2]/div[1]/a/b")
    private WebElement locationItem;

    @FindBy(id = "page_layout")
    private WebElement searchUser;


    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        logger.info("Search page opened");
    }

    public void search(String searchobject) {
        searchField.sendKeys(searchobject);
        locationItem.click();

        logger.info("User is searched");
    }

    public boolean getUserSearch() {
        return searchUser.isDisplayed();
    }
}

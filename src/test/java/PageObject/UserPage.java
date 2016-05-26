package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

/**
 * Created by Alena on 22.05.2016.
 */
public class UserPage extends AbstractPage {
    private final Logger logger = Logger.getLogger(LoginPage.class.getName());
    private final String BASE_URL = "https://vk.com/feed";

  /*  @FindBy(xpath = "//*[@id=\"friend_status\"]/div[1]/button")
    private WebElement addUserButton;

    @FindBy(id = "nohook_modal_close")
    private WebElement closeAddFriend;

    @FindBy(xpath = "//*[@id=\"profile_message_send\"]/div/a[1]/button")
    private WebElement messageBtn;

    @FindBy(id = "ok-e-m")
    private WebElement messageText;

    @FindBy(xpath = ".//*[@id='topPanelPopup_m']/div[2]/div/div[1]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[3]")
    private WebElement sendMessageBtn;*/

    @FindBy(xpath = "//*[@id=\"l_ph\"]/a/span/span[2]")
    private WebElement photosBtn;

    @FindBy(id = "pv_photo")
    private WebElement idPhoto;

   /* @FindBy(id = "hook_Block_KlassOverPLB")
    private WebElement klassBtn;

    @FindBy(xpath = "//*[@id='hook_Block_PopLayerViewFriendPhotoRating']/a[2]")
    private WebElement markBtn;

    @FindBy(xpath = "//*[@id='action_menu_friendship_request_sent_a']/span")
    private WebElement userAdd;

    @FindBy(xpath = "//*[@id='hook_Block_PopLayerViewFriendPhotoRating']/span[2]")
    private WebElement setMark;*/

    @FindBy(xpath = "//*[@id=\"album206892093_00?rev=1\"]/div/a/img")
    private WebElement imgPhoto;

    public UserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
        logger.info("User page opened");
    }

    /*public void addUser() {
        addUserButton.click();
        closeAddFriend.click();
        logger.info("User id added");
    }

    public void sendMessage(String mText) {
        messageBtn.click();
        messageText.sendKeys(mText);
        sendMessageBtn.click();
        logger.info("Messsage is send");
    }*/

    public void seePhoto() {
        photosBtn.click();
        idPhoto.click();
        logger.info("Photo See");
    }
/*
    public void setKlassToPhoto() {
        klassBtn.click();
        logger.info("Klass");
    }

    public void setMarkToPhoto() {
        //markBtn.click();
        logger.info("Mark 5");
    }

    public boolean getUserAdd() {
        return closeAddFriend.isDisplayed();
    }

    public boolean getMessageText() {
        return messageText.isDisplayed();
    }*/

    public boolean getImgPhoto() {
        return imgPhoto.isDisplayed();
    }

   /* public boolean getKlassBtn() {
        return klassBtn.isDisplayed();
    }

    public boolean getSetMark() {
        return setMark.isDisplayed();
    }*/
}

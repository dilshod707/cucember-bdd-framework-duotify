package pages;

import lombok.Data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login-username")
    private WebElement usernameField;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(xpath = "//span[contains(text(), 'Incorrect username or password.')]")
    private WebElement invalidCredentials;

    public void validLogin() {
        usernameField.sendKeys("emilyjohnson202324@gmail.com", Keys.TAB, "DuotechAcademy2023", Keys.ENTER);
    }

    @FindBy(xpath = "//button[@data-testid='login-button']")
    private WebElement loginButton;

    @FindBy(id = "login-button")
    private WebElement signInButton;


    @FindBy(xpath = "//div[@data-testid='placeholder-wrapper']")
    private WebElement profileIcon;

    public WebElement validProfileIcon() {
        return profileIcon;
    }

    @FindBy(xpath = "(//button[@class='wC9sIed7pfp47wZbmU6m'])[1]")
    private WebElement accountPageBtn;   // button to navigate to account page(profile icon -> dropdown -> account)

    public WebElement getAccountPageBtn() {
        return accountPageBtn;
    }
}




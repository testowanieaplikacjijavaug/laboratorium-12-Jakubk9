import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zad2PO {
    private WebDriver webDriver;

    @FindBy(name = "username")
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;

    public Zad2PO(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void login(int i,String login, String pass) {
        if (i == 1) {
            webDriver.get("https://github.com/login");
        } else {
            webDriver.get("https://konto.onet.pl/auth.html?app_id=poczta.onet.pl.front.onetapi.pl");
        }

        this.username.sendKeys(login);
        this.password.sendKeys(pass + Keys.ENTER);
    }
}

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zad3PO {
    private WebDriver webDriver;

    @FindBy(name = "query")
    private WebElement input;


    public Zad3PO(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void search(int i,String login) {
        if (i == 1) {
            webDriver.get("https://swisscows.com/");
        } else {
            webDriver.get("https://www.startpage.com/");
        }

        this.input.sendKeys("Test" + Keys.ENTER);
    }
}

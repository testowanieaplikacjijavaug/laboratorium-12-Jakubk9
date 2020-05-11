import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    private final WebDriver webDriver;

    @FindBy(id = "search_form_input_homepage")
    private WebElement input;
    @FindBy(id = "search_button_homepage")
    private WebElement search;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public PageObject putIntoInput(String keys) {
        input.sendKeys(keys);
        return this;
    }

    public PageObject searchClick() {
        search.click();
        return this;
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public String getSource() {
        return webDriver.getPageSource();
    }
}

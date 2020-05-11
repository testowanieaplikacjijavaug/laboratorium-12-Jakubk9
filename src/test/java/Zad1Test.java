import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SeleniumExtension.class)
public class Zad1Test {
    private WebDriver webDriver;
    private PageObject pageObject;

    public Zad1Test(ChromeDriver chromeDriver) {
        this.webDriver = chromeDriver;
        pageObject = new PageObject(webDriver);
    }

    @BeforeEach
    public void goToPage() {
        webDriver.get("https://duckduckgo.com/");
    }

    @Test
    public void testTitlePage() {
        assertEquals("DuckDuckGo — Privacy, simplified.", pageObject.getTitle());
    }

    @Test
    public void testSource() {
        assertTrue(pageObject.getSource().contains("DuckDuckGo"));
    }

    @Test
    public void testClick() {
        pageObject.putIntoInput("Testowanie").searchClick();

        assertEquals("Testowanie at DuckDuckGo", pageObject.getTitle());
    }
}

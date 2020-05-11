import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SeleniumExtension.class)
public class Zad3Test {
    private WebDriver webDriver;
    private Zad3PO zad3PO;

    public Zad3Test(ChromeDriver chromeDriver) {
        this.webDriver = chromeDriver;
        zad3PO = new Zad3PO(webDriver);
    }

    @Test
    public void SwisscowsTest() {
        zad3PO.search(1, "Test");
        assertEquals(webDriver.getTitle(), "Test in Web search - Swisscows");
    }

    @Test
    public void StartpageTest() {
        zad3PO.search(2, "Test");
        assertEquals(webDriver.getTitle(), "Startpage.com Search results");
    }
}

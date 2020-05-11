import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SeleniumExtension.class)
public class Zad2Test {
    private WebDriver webDriver;
    private Zad2PO zad2PO;

    public Zad2Test(ChromeDriver chromeDriver) {
        this.webDriver = chromeDriver;
        zad2PO = new Zad2PO(webDriver);
    }

    @Test
    public void githubLoginTest() {
        zad2PO.login(1, "test", "test");
        assertEquals(webDriver.getTitle(), "GitHub");
    }

    @Test
    public void onetLoginTest() {
        zad2PO.login(2, "test", "test");
        assertEquals(webDriver.getTitle(), "Poczta w Onet.pl");
    }
}

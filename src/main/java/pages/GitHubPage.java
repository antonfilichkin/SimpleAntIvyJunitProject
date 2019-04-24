package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubPage {
    private final static String URL = "https://github.com/";
    private final static String Name = "GitHub";

    @FindBy(css = ".octicon")
    private static List<WebElement> octicon;

    private static WebElement uninitialized;

    private WebDriver driver;

    public GitHubPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }

    public void assertTitle() {
        assertEquals(driver.getTitle(), Name);
    }

    public void countOcticons(int expected) {
        assertEquals(expected, octicon.size());
    }

    //method throwing error
    public void error() {
        uninitialized.click();
    }
}
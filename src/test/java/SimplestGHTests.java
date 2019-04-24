import driver.Driver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GitHubPage;

public class SimplestGHTests {
    private static WebDriver driver;
    private static GitHubPage ghPage;

    @BeforeAll
    public static void init() {
        driver = Driver.getDriver();
        ghPage = PageFactory.initElements(driver, GitHubPage.class);
    }

    @AfterAll
    public static void kill() {
        driver.close();
    }

    @BeforeEach
    public static void prepare() {
        ghPage.open();
    }

    @Test
    @DisplayName("Passed Test")
    public static void passedTest() {
        ghPage.countOcticons(23);
    }

    @Test
    @DisplayName("Failed Test")
    public static void failedTest() {
        ghPage.countOcticons(42);
    }

    @Test
    @DisplayName("Error Test")
    public static void errorTest() {
        ghPage.error();
    }
}

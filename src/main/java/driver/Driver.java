package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class Driver {
    private static WebDriver driver;

    // Private constructor prevents instantiation from other classes
    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setupDriver();
            driver = new ChromeDriver();
            manageDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver Closed!");
        } else {
            System.out.println("No Driver found");
        }
    }

    private static void setupDriver() {
        setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    private static void manageDriver() {
        driver.manage().window().maximize();
    }
}

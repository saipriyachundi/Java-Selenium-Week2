import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://amazon.com");
            Thread.sleep(5000);

            // Capture screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("C:\\Users\\AjaySomepalli\\Downloads\\screenshot.png");
            FileHandler.copy(source, destination);

            System.out.println(" Screenshot saved at: " + destination.getAbsolutePath());

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

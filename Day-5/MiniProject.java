import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.io.FileHandler;

public class MiniProject {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Step 1: Open login page
            driver.get("https://practicetestautomation.com/practice-test-login/");
            Thread.sleep(2000);

            // Step 2: Type username and password
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");
            Thread.sleep(1000);

            // Step 3: Click login button
            driver.findElement(By.id("submit")).click();
            Thread.sleep(2000);

            // Step 4: Validate title after login
            String expectedTitle = "Logged In Successfully | Practice Test Automation";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println(" Login success and title matched!");
            } else {
                System.out.println(" Login failed or title mismatch!");
            }

            // Step 5: Capture screenshot for proof
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\AjaySomepalli\\Downloads\\login_result.png");
            FileHandler.copy(src, dest);
            System.out.println(" Screenshot saved at: " + dest.getAbsolutePath());

            Thread.sleep(3000);
            driver.quit();
            System.out.println(" Mini project completed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

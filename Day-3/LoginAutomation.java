import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Step 2: Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Step 3: Open a sample login page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        // Wait for 2 seconds to see the page
        Thread.sleep(2000);

        // Step 4: Enter username and password
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");

        // Wait for 1.5 seconds before clicking login
        Thread.sleep(1500);

        // Step 5: Click Login button
        driver.findElement(By.id("submit")).click();

        // Wait for 3 seconds to observe result
        Thread.sleep(3000);

        // Step 6: Print confirmation
        System.out.println("✅ Login test executed successfully!");

        // Step 7: Close browser
        driver.quit();
    }
}

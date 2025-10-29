import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClick {
    public static void main(String[] args) {
        try {
            // Step 1: Setup ChromeDriver
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

            // Step 2: Launch Chrome
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Step 3: Open test site
            driver.get("https://practicetestautomation.com/practice-test-login/");
            Thread.sleep(2000); // wait for page to load

            // Step 4: Type username
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("student");
            System.out.println(" Typed username: student");
            Thread.sleep(1500);

            // Step 5: Type password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("Password123");
            System.out.println(" Typed password: Password123");
            Thread.sleep(1500);

            // Step 6: Click Login button
            WebElement loginBtn = driver.findElement(By.id("submit"));
            loginBtn.click();
            System.out.println(" Clicked on the Login button");

            // Step 7: Wait to observe result
            Thread.sleep(3000);

            // Step 8: Close browser
            driver.quit();
            System.out.println(" Test completed and browser closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

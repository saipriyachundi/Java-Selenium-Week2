import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", 
            "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Step 2: Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Step 3: Open the login page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        // Wait 2 seconds to see the page load
        Thread.sleep(2000);

        // Step 4: Locate username field and type slowly
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Priya");
        System.out.println("Typed username: Priya");

        // Wait 2 seconds before entering password
        Thread.sleep(5000);

        // Step 5: Locate password field and type slowly
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        System.out.println("Typed password: Password123");

        // Wait 3 seconds before closing to view results
        Thread.sleep(5000);

        // Step 6: Print confirmation and close browser
        System.out.println(" XPath locators executed successfullyy!");
        driver.quit();
    }
}

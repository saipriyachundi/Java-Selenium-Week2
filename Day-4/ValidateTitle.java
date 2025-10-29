import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://practicetestautomation.com/practice-test-login/");
            Thread.sleep(5000);

            String expectedTitle = "Test Login | Practice Test Automation";
            String actualTitle = driver.getTitle();

            System.out.println("Expected Title: " + expectedTitle);
            System.out.println("Actual Title:   " + actualTitle);

            if (actualTitle.equals(expectedTitle)) {
                System.out.println(" Title Validation Passed!");
            } else {
                System.out.println(" Title Validation Failed!");
            }

            Thread.sleep(5000);
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

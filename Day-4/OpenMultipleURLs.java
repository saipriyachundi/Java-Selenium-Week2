import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleURLs {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\AjaySomepalli\\Downloads\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // List of URLs to visit
            String[] urls = {
                "https://www.google.com/",
                "https://www.bing.com/",
                "https://www.gmail.com/"
            };

            for (String site : urls) {
                try {
                    driver.navigate().to(site);
                    System.out.println(" Opened: " + site);
                    Thread.sleep(4000); // wait 4s to load fully
                } catch (Exception e) {
                    System.out.println(" Error loading " + site + ": " + e.getMessage());
                }
            }

            driver.quit();
            System.out.println(" All sites visited successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

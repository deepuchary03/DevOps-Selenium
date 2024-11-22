import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chary\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe"); // Update this path

        // Create an instance of ChromeDrive
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.amazon.com");

        // Print the title of the page
        System.out.println(driver.getTitle());

        // Close the browser
     
    }
}
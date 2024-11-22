import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Main {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chary\\Desktop\\selenium\\exp11\\selenium test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testIncrementButton() {
        driver.get("C:\\Users\\chary\\Desktop\\selenium\\exp11\\selenium test\\src\\program.html");
        driver.findElement(By.id("increment-button")).click();
        String result = driver.findElement(By.id("output")).getText();
        assert result.equals("1");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
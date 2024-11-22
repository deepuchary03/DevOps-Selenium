import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chary\\Desktop\\selenium\\exp12\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePageLoad() {
        driver.get("http://localhost:8080");
        String title = driver.getTitle();
        assertEquals("My Containerized Application", title);
    }

    @Test  
    public void testSubmitForm() {
        driver.get("http://localhost:8080");
        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("submit")).click();
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Form submitted successfully!", result);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
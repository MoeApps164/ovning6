package se.moe.ovning6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
public class RegisterTest {

    public static void main(String[] args) {

        // 1. Starta Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2. Öppna Demo Web Shop
        driver.get("https://demowebshop.tricentis.com/");

        try {
            // 3. Hitta länken "Register" (synlig text)
            WebElement registerLink =
                    driver.findElement(By.linkText("Register"));

            // 4. Klicka på Register
            registerLink.click();

            // 5. Verifiera att vi hamnade rätt
            String title = driver.getTitle();

            if (title.contains("Register")) {
                System.out.println("TEST OK: Register-sidan öppnades");
            } else {
                System.out.println("TEST FEL: Fel sida öppnades");
            }

        } catch (NoSuchElementException e) {
            System.out.println("TEST FEL: Register-länken hittades inte");
        }

        // 6. Stäng webbläsaren
        driver.quit();
    }
}

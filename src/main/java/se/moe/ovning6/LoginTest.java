package se.moe.ovning6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {

    public static void main(String[] args) {

        // Starta Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");


        try {
            // 1) Hitta och klicka på "Log in"
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();

            // 2) Verifiera (URL ska innehålla "login")
            String url = driver.getCurrentUrl();
            if (url.contains("login")) {
                System.out.println("TEST OK: Login-sidan öppnades. URL: " + url);
            } else {
                System.out.println("TEST FEL: Fel sida öppnades. URL: " + url);
            }

        } catch (NoSuchElementException e) {
            System.out.println("TEST FEL: Kunde inte hitta länken 'Log in'.");
        }

        driver.quit();
    }
}

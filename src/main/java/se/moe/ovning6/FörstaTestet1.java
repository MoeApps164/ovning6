package se.moe.ovning6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FörstaTestet1 {

    public static void main(String[] args) {

        // 1. Ställ in ChromeDriver automatiskt
        WebDriverManager.chromedriver().setup();

        // 2. Starta webbläsaren Chrome
        WebDriver driver = new ChromeDriver();

        // 3. Gå till en webbsida (Demo Web Shop)
        driver.get("https://demowebshop.tricentis.com/");

        WebElement element = driver.findElement(By.className("search-box-text"));
        System.out.println("Element hittat: " + element.getTagName());

        element.sendKeys("Camera");
        element.submit();


         System.out.println("Ny Titel" + driver.getTitle ());
        System.out.println("url" + driver.getCurrentUrl ());








        // 4. Hämta sidans titel och skriv ut i IntelliJ
        System.out.println("Sidtitel: " + driver.getTitle());

        // 5. Pausa 3 sekunder så du ser sidan
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 6. Stäng Chrome
        driver.quit();
    }

}

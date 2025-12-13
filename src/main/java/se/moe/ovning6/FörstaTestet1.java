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


        WebElement registerElement = driver.findElement(By.partialLinkText("Log"));

        registerElement.click();

        System.out.println( "Ny sidtitel " + driver.getTitle());
        System.out.println( "Ny Url efter klick " + driver.getCurrentUrl());


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

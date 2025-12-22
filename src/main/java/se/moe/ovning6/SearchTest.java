package se.moe.ovning6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        try {
            WebElement searchField = driver.findElement(By.id("small-searchterms"));
            System.out.println("TEST OK: Sökfält hittades. Tag: " + searchField.getTagName());
        } catch (NoSuchElementException e) {
            System.out.println("TEST FEL: Sökfält hittades inte.");
        }

        driver.quit();
    }
}
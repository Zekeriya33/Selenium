package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_odev02 {
    /*
  1. “https://www.saucedemo.com” Adresine gidin
  2. Username kutusuna “standard_user” yazdirin
  3. Password kutusuna “secret_sauce” yazdirin
  4. Login tusuna basin
  5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
  6. Add to Cart butonuna basin
  7. Alisveris sepetine tiklayin
  8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
  9. Sayfayi kapatin

   */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //  2. Username kutusuna “standard_user” yazdirin
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        //  3. Password kutusuna “secret_sauce” yazdirin
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        //  4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
        //  5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();
        //  6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //  7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_badge")).click();
        //  8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepetEkleme = driver.findElement(By.className("inventory_item_name"));
        if (sepetEkleme.isDisplayed()){
            System.out.println("Sepet Testi Passed");
        }else System.out.println("Sepet Testi FAILED");
        //  9. Sayfayi kapatin
        driver.close();
        //
    }
}
package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev01 {
    /*
   1-C01_TekrarTesti isimli bir class olusturun
   2- https://www.amazon.com/ adresine gidin

   3- Browseri tam sayfa yapin
   4- Sayfayi “refresh” yapin
   5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
   6- Gift Cards sekmesine basin
   7- Birthday butonuna basin
   8- Best Seller bolumunden ilk urunu tiklayin
   9- Gift card details’den 25 $’i secin
   10- Urun ucretinin 25$ oldugunu test edin
    11-Sayfayi kapatin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(  15 ));
      //  2- https://www.amazon.com/ adresine gidin
        driver.navigate().to("https://amazon.com");
      //  4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
      // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test ediniz
        System.out.println("Test Passed" + driver.getTitle().contains("Spend less"));
      // 6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
      // 7- Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();
      // 8- Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> listem = driver.findElements(By.xpath("(//*[@class='a-carousel'])[2]"));
        listem.get(0).click();
    }


}

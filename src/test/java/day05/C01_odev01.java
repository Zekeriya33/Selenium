package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_odev01 {
    /*
     * https://www.google.com/adresinegidin
     * cookies uyarisini kabul ederek kapatin
     * Sayfa basliginin “Google” ifadesi icerdigini testedin
     * Arama cubuguna “Nutella” yazip aratin
     * Bulunan sonuc sayisini yazdirin
     * sonucsayisinin10milyon’dan fazla oldugunu test edin
     * Sayfayi kapatin
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

  // * https://www.google.com/adresinegidin
        driver.get("https://www.google.com/");
  // * cookies uyarisini kabul ederek kapatin
  // * Sayfa basliginin “Google” ifadesi icerdigini testedin
       if (driver.getTitle().contains("Google")){
           System.out.println("Baslik Testi PASSED");
       }else System.out.println("Baslik Testi FAILED");
  // * Arama cubuguna “Nutella” yazip aratin
        WebElement nutella = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        nutella.sendKeys("Nutella" , Keys.ENTER);
  // * Bulunan sonuc sayisini yazdirin
        List<WebElement> aramasonucu = driver.findElements(By.xpath("//*[@id='result-stats']"));
        String [] sonucYazisi =aramasonucu.get(0).getText().split("");
        System.out.println(sonucYazisi[1]);
        // * sonucsayisinin10milyon’dan fazla oldugunu test edin
        int sonuc= Integer.parseInt(sonucYazisi[1].replaceAll("\\D", ""));
        if (sonuc>10000){
            System.out.println("sonuc sayisi testi PASSED");
        }else System.out.println("sonuc sayisi testi FAILED");


  // * Sayfayi kapatin
        driver.close();
    }
}

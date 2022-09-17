package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ornek {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

      //  Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
      //  Sayfa basligini(title) yazdirin
        System.out.println("sayfa basligi : "+ driver.getTitle());
        //  Sayfa basliginin “Amazon” icerdigini test edin
        if(driver.getTitle().contains("Amazon")){
            System.out.println(" Title testi Passed");
        } else{
            System.out.println("Title testi Failed");
        }
      //  Sayfa adresini(url) yazdirin
        driver.getCurrentUrl();
      //  Sayfa url’inin “amazon” icerdigini test edin.
        if(driver.getCurrentUrl().contains("amazon")){
            System.out.println(" Url testi Passed");
        } else {
            System.out.println("Url testi Failed");
        }
      //          Sayfa handle degerini yazdirin
        driver.getWindowHandle();

      //  Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if(driver.getPageSource().contains("Gateway")){
            System.out.println(" HTML kodu Gateway kelimesi iceriyor");
        } else {
            System.out.println(" HTML kodu Gateway kelimesi icermiyor");
        }

      //  Sayfayi kapatin.
        driver.close();

    }
}

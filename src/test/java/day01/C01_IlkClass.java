package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        /*
        En temel haliyle otomasyon yapmak icin clasimiza otomasyon icin
        gerekli olan webdriver'ın yerini gostermemiz gerekir
        bunun icin Java kutuphanesinden System.setProperty() method'unu kullaniriz
        ve method'un icine ilk olarak driver i ytazariz. ikinci olarak onun fiziki
        yolunu kopyalariz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
         driver.get("https://www.amazon.com.tr");
        System.out.println("Actual Title : " + driver.getTitle()); // gidilen sitenin basligini yazdirir
        System.out.println("Actual url : " + driver.getCurrentUrl()); // gidilen sayfanin url ini getirir
        System.out.println(driver.getPageSource());
    }
}

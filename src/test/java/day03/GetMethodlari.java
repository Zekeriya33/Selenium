package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    /*
   - Amazon a sayfasina gidiniz
   - Arama Kutusunu Locate ediniz
   - Arama kutusunun tagName inin input oldugunu test ediniz
   - Arama kutusunun name atributu nun degerinin field-keywords oldugunu test ediniz
   - Sayfayi kapatiniz
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     //   - Amazon a sayfasina gidiniz
        driver.get("https://amazon.com");
     //   - Arama Kutusunu Locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
     //   - Arama kutusunun tagName inin input oldugunu test ediniz
        String ExpectedTagName= "input";
        String actualTagName = aramaKutusu.getTagName();
        if(actualTagName.equals(actualTagName)){
            System.out.println("TagName Testi PASSED "+ ExpectedTagName);
        } else System.out.println("TagName Testi FAILED");
     //   - Arama kutusunun name atributu nun degerinin field-keywords oldugunu test ediniz
    String expectedAtributuName= "field-keywords";
    String actualAtributuName = aramaKutusu.getAttribute("name");
    if(actualAtributuName.equals(actualAtributuName)){

           System.out.println("Atributu Testi PASSED");
    } else System.out.println("Atributu Testi FAILED"   );

     //   - Sayfayi kapatiniz
        driver.close();

    }
}

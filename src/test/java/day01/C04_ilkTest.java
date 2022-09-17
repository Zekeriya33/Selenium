package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ilkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        1- amazon sayfasina gidiniz
        2- Basligin "amazon icerdigini test ediniz
        3- url nin amazon icerdigini test edin
        4- sayfayi kapatin
         */
       driver.manage().window().maximize();
        driver.get("https://amazon.com");

        if(driver.getTitle().contains("Amazon")){
            System.out.println("Title Test basarili");
        }else {
            System.out.println("Title test basarisiz");
        }
        if(driver.getCurrentUrl().contains("amazon")){
            System.out.println("url Test basarili");
        }else {
            System.out.println("url test basarisiz");
        }
        driver.close();
    }
}

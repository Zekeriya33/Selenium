package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


//    Amazon soyfasina gidelim. https://www.amazon.com/
       driver.get("https://amazon.com");
//    Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere Konumu : "+driver.manage().window().getPosition()); // Acilan browser in konumunu veriri
        System.out.println("Pencere Olculeri : "+driver.manage().window().getSize()); // Acilan browser in olculerini veriri
//    Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); // Pencereyi simge durumuna getiri
//    simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
//    Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere Konumu : "+driver.manage().window().getPosition()); // Acilan browser in konumunu veriri
        System.out.println("Yeni Pencere Olculeri : "+driver.manage().window().getSize()); // Acilan browser in olculerini veriri
    //    Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
//    Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("FullScreen Pencere Konumu : "+driver.manage().window().getPosition()); // Acilan browser in konumunu veriri
        System.out.println("FullScreen Pencere Olculeri : "+driver.manage().window().getSize()); // Acilan browser in olculerini veriri
//    Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}

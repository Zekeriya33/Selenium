package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        İleride wait konusunu daha genis olarak  ele alacagiz
        Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir
        yukleme  suresine ihtiyac vardir. veya web elementin kullanilabilmesi icin bir zamana
        ihtiyac olabilir.
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM sureyi belirleme olanagi tanir
         */
    }
}

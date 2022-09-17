package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ornek2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);
      //  Facebook soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
      //  Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);
      //  Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);
      //  Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);

      //  Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
        driver.quit();

    }
}

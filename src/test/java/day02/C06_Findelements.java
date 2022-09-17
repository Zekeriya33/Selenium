package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_Findelements {
    public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    // Amazon sayfasina gidiniz
        driver.get("https://amazon.com");
    // Amazon sayfasindaki tag lari link(a) olanlarin sayisini yazdiriniz
      List<WebElement> taq = driver.findElements(By.tagName("a"));
      System.out.println("A taginin sayisi : " + taq.size());

        List<WebElement> taq2 = driver.findElements(By.tagName("input"));
        System.out.println("input taginin sayisi : " + taq2.size());

}
}

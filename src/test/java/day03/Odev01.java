package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev01 {
    /*
  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
  2- Add Element butonuna basin
  Delete butonu’nun gorunur oldugunu test edin
   Delete tusuna basin
  “Add/Remove Elements” yazisinin gorunur oldugunu test edin
   */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


 //  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
 //  2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        Thread.sleep(3000);
 //  Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButunu = driver.findElement(By.xpath("//*[text()='Delete']"));
        if(deleteButunu.isDisplayed()){
            System.out.println("delete botonu testi PASSED");
        } else System.out.println("delete buyonu Testi FAILED");
 //   Delete tusuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
 //  “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemove = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemove.isDisplayed()){
            System.out.println("Add/Remove testi PASSED" );
        }else System.out.println("Add/Remove testi FAILED");

        driver.close();





    }
}

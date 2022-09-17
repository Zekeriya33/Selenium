package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

import java.time.Duration;
import java.util.List;

public class ornek01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */
//    a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//    b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
//    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        Thread.sleep(3000);
        WebElement emailTextbox= driver.findElement(By.id("session_email"));
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("session_password"));
        Thread.sleep(3000);
        WebElement signin = driver.findElement(By.name("commit"));
//    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//    i. Username : testtechproed@gmail.com
//    ii. Password : Test1234!
        emailTextbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();
//            e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
         WebElement expectedUser = driver.findElement(By.className("navbar-text"));
         if(expectedUser.isDisplayed()){
             System.out.println("ExpectedUser Testi PASSED "+expectedUser.getText());
         } else System.out.println("ExpectedUser Testi FAILED ");
         // Bir webelemntin uzerindeki yaziyi konsolda yazdirabilmek icin getText() Methodu kullanilir

//            f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if(addresses.isDisplayed()){
            System.out.println("Addresses Testi PASSED");
        } else{
            System.out.println("Addresses Testi FAILED");
        }
        if(signOut.isDisplayed()){
            System.out.println("signOut Testi PASSED");
        } else System.out.println("signOut Testi FAILED"   );
//    3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi : "+ linklerListesi.size());

//    4. Linkleri yazdiralim
        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());

        }
//    5. Linkleri Lambda ile yazdirin
        linklerListesi.stream().forEach(t-> System.out.println(t.getText()));
        // Sayfayi kapatin

     // driver.close();
     // driver.quit();

    }
}

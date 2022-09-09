import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        // driver.navigate().to()  nethodu sayfada ileri geri yapacaksak kullanilir
        // driver.get() gibi bizi istedigimiz url e goturur
        driver.navigate().to("https://techproeducation.com");
        // tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();
        // tekrar techproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        // techproeducation sayfasini yenileyeli
        Thread.sleep(3000);
        driver.navigate().refresh();
        // sayfayi kapatiniz
        driver.close();
        //




    }
}

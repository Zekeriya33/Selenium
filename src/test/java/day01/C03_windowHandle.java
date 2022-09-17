package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_windowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle()); //CDwindow-6FE0CA667F0D90174303FDF5516D6ED7
        driver.close();

        // farkli pencereler arasinda gezinebilmek icin get.windowHandle() methodunu kullaniriz
    }
}

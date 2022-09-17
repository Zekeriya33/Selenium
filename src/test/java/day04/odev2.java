package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class odev2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna 10 kez basin
       WebElement addElement= driver.findElement(By.xpath("//*[text()='Add Element']"));
         for (int i = 1; i <=10 ; i++) {
            addElement.click();}
       // 3- 10 kez Add element butonuna basildigini test ediniz
             List<WebElement>deleteButonList= driver.findElements(By.xpath("//*[text()='Delete']"));
             System.out.println("delete buton sayisi"+ deleteButonList.size());
             if(deleteButonList.size()==10){
                 System.out.println("Add element tusuna 10 kez basilmistir");
             }else System.out.println("Add element tusuna 10 kez basilmamistir");

       //4- Delete butonu gorunmeyene kadar basiniz
             deleteButonList.stream().forEach(t-> t.click());

             //5- Delete butonunun gorunmedigini test ediniz
        WebElement anaSayfa = driver.findElement(By.className("no-js"));
        String deleteButton ="delete";
        if (!anaSayfa.getText().contains(deleteButton)){
            System.out.println("test PASSED");
        } else System.out.println("Test FAILED");

        driver.close();


        }

    }




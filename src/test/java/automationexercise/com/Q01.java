package automationexercise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    /*
    1. Launch browser   -- Tarayıcıyı başlat
2. Navigate to url 'http://automationexercise.com' --
3. Verify that home page is visible successfully  -- Ana sayfanın başarıyla görünür olduğunu doğrulayın
4. Click on 'Signup / Login' button -- 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
5. Verify 'New User Signup!' is visible -- 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth -- Ayrıntıları doldurun: Unvan, Ad, E-posta, Şifre, Doğum tarihi
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible -- HESAP OLUŞTURULDU!' görünür
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   //  1. Launch browser

   //  2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
   //  3. Verify that home page is visible successfully
      WebElement homePage = driver.findElement(By.xpath(" //*[text()=' Home']"));
      if (homePage.isDisplayed()){
          System.out.println("Homepage Testi PASSED");
      } else System.out.println("Homepage Testi FAILED");
   //  4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
   //  5. Verify 'New User Signup!' is visible
        WebElement newUser = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        if(newUser.isDisplayed()){
            System.out.println("New User Testi PASSED");
        }else System.out.println("New User Testi FAILED");
   //  6. Enter name and email address
        Thread.sleep(3000);
        WebElement name = driver.findElement(By.xpath("//*[@data-qa='signup-name']"));
        WebElement email= driver.findElement(By.xpath("//*[@data-qa='signup-email']"));
        name.sendKeys("Zekeriya");
        Thread.sleep(3000);
        email.sendKeys("bozkurt.nidanursa323232323232323232323232323232323232323232323232@hotmail.com");
   //  7. Click 'Signup' button
        driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
   //  8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccount = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        if (enterAccount.isDisplayed()){
            System.out.println("ENTER ACCOUNT INFORMATION Testi PASSED");
        }else System.out.println("ENTER ACCOUNT INFORMATION Testi FAILED");
   //  9. Fill details: Title, Name, Email, Password, Date of birth
         driver.findElement(By.id("id_gender1")).click();
         WebElement password = driver.findElement(By.xpath("//*[@data-qa='password']"));
         password.sendKeys("Test1234!");
         driver.findElement(By.id("days")).click();
         driver.findElement(By.xpath("//*[text()='26']")).click();
         driver.findElement(By.id("uniform-months")).click();
         driver.findElement(By.xpath("//*[text()='September']")).click();
         driver.findElement(By.id("years")).click();
         driver.findElement(By.xpath("//*[text()='1983']")).click();
   //  10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//*[text()='Sign up for our newsletter!']")).click();
   //  11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//*[text()='Receive special offers from our partners!']")).click();
        Thread.sleep(3000);
   //  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName =driver.findElement(By.id("first_name"));

        WebElement lastName = driver.findElement(By.id("last_name"));

        WebElement company = driver.findElement(By.xpath("//*[@id='company']"));

        WebElement address = driver.findElement(By.id("address1"));

        WebElement address2 = driver.findElement(By.id("address1"));

        driver.findElement(By.xpath("//*[@id='country']")).click();

        driver.findElement(By.xpath("//*[text()='United States']")).click();

        WebElement state =driver.findElement(By.xpath("//*[@id='state']"));

        WebElement city =driver.findElement(By.xpath("//*[@id='city']"));

        WebElement zipcode = driver.findElement(By.xpath("//*[@id='zipcode']"));
        Thread.sleep(3000);
        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id='mobile_number']"));
        Thread.sleep(3000);
        firstName.sendKeys("Zekeriya");
        Thread.sleep(3000);
        lastName.sendKeys("Bozkurt");
        Thread.sleep(3000);
        company.sendKeys("leyya Bebe");
        Thread.sleep(3000);
        address.sendKeys("Cagdaskent mah mimar sinan bulv");
        Thread.sleep(3000);
        address2.sendKeys("no:63 Toroslar");
        Thread.sleep(3000);
        state.sendKeys("Mersin");
        Thread.sleep(3000);
        city.sendKeys("Toroslar");
        Thread.sleep(3000);
        zipcode.sendKeys("33230");
        Thread.sleep(3000);
        phoneNumber.sendKeys("5536212760");
   //  13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
   //  14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.className("title text-center"));
        if (accountCreated.isDisplayed()){
            System.out.println("Account Created Testi PASSED");
        } else System.out.println("Account Created Testi FAILED");
   //  15. Click 'Continue' button
        driver.findElement(By.className("btn btn-primary")).click();
   //  16. Verify that 'Logged in as username' is visible
   //  17. Click 'Delete Account' button
   //  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    }
}

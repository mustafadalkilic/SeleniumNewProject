package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {

        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle=driver.getTitle();
        String expectedTitle ="Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");  ////testeer olarak asil amacimiz actual ile expected karsilastirilmasidir.
        // actual expected i iceriyor ise passed icermiyor ise failed aliriz


        //Url'in https://www.amazon.com olduğunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualUrl);


        //Sayfayı kapatalım

        driver.close();//Browserı kapatır.
        //driver.quit()-> Birden fazla browser varsa heprsini kapatır.






    }
}

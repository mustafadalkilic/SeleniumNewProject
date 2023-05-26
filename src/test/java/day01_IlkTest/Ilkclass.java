package day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/receorces/drivers/chromedriver.exe");
        //Java uygulamalrında system ozellıklerını ayarlamak ıcın setPropety methodu ıle kullanırız

        System.out.println("webdriver.chrome.driver");
        //getProperty ile "Key" degerini girerek "value"ya ulasabilirim

        WebDriver driver =new ChromeDriver();


        driver.get("https://www.techproeducation.com");//get() methodu ıle Strıng olarak gırılen urrl e gıderız





    }
}

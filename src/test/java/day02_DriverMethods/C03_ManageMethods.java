package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();
        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
    webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
    maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
    browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
    ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
     */


        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));//istedıgımız konuma getırır
        driver.manage().window().setSize(new Dimension(600,600));//Istedigimiz genislige getirir


        //sayfayı kapatınız
        driver.close();
        //Sayfanin icinde gordugumuz tum kutucuklar tum kisimlar birer web elementidir.Bunlarin butunu web sayfasini olusturur.
        //Thread.sleep Javadan gelir kac saniye dersek kodu bekletir ama
        // implicitlyWait() methodu Selenium dan gelir ve istenilen sayfa acilincaya kadar bekleme suresini belirtir.
        // implicitlyWait() methodu ile istedigimiz kadar bekleme suresi koyabiliriz.
        // Web elementini gordugu anda bir alt satira gecerek kodu okumaya devam eder





    }
}
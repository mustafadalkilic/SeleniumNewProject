package day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Xpath  {
    public static void main(String[] args) {

        System.setProperty("chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike"  yazıp aratın

        //Arama kutus html kodları
        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        // placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        // aria-label="Search Amazon" spellcheck="false">

       // WebElement aramakutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        //WebElement aramaKutusu = driver.findElement(By.xpath("//*[@name='field-keywords']"));
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();// --> //*[.='Hybrid Bikes']

        // sonuc sayısını yazdırın
        WebElement sonucYazısı = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        String [] sonucSayısı=sonucYazısı.getText().split(" ");
        System.out.println("Sonuc sayisi = "+sonucSayısı[0]);


        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//h2)[1]")).click();


        // Sayfayı kapatınız
        driver.close();







    }
}

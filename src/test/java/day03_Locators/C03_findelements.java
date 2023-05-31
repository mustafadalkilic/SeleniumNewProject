package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {

    public static void main(String[] args) {
        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        //Sayfadaki linklerin sayısını ve linkleri yazdıralım

         /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodunu kullanırız.
        Bu webelementlerin sayısına ulaşmak için ya da bu web elementlerin yazısını konsola yazdırabilmek için
        List<Webelement> linklerLlistesi=driver.findelements(By.locator("locator değeri")) olarak kullanırız.
        Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
         */

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı ="+ linklerListesi.size());

       // for (WebElement w :linklerListesi){
         //   if(!w.getText().isEmpty())
          //  System.out.println(w.getText());

        //Lambda ile yazdırma

        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});



        //Shop deals in Electronics webelementının yazısını yazdıralım
        System.out.println("************************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        System.out.println(webElementYazisi.getText());

        driver.close();

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipone", Keys.ENTER);

        //çıkan sonuç yazısını konsola yazdırınız

        driver.findElements(By.cssSelector(".s-result-item h2 a span")).forEach(element ->
                System.out.println(element.getText()));


        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız

        for (int i = 1; i <= 5; i++) {
            WebElement productLink = driver.findElement(By.cssSelector(".s-result-item:nth-of-type(" + i + ") h2 a"));
            productLink.click();
            System.out.println(driver.getTitle());
            driver.navigate().back();
        }



    }
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage {

    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        By cookiesSelector = By.name("accept");
        driver.findElement(cookiesSelector).click();

    }

    @AfterMethod
    public void fermerChrome() {
       driver.quit();
    }

    @Test
    public void testAmazon(){
        String resultatAttendu = "Nintendo";

        HomePageAmazon hm = new HomePageAmazon(driver);
        hm.putProductTitle();
        hm.validateSearchBox();

        ArticlePage ag = new ArticlePage(driver);
        ag.chooseFirstArticle();

        Assert.assertTrue(ag.chooseFirstArticle().contains(resultatAttendu),"le titre ne match pas");


    }

}

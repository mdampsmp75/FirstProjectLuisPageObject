import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class HomePageAmazon {

    WebDriver driver;
    By checkBoxSelector = By.id("twotabsearchtextbox");
    By validateSearchSelector = By.id("nav-search-submit-button");

    public HomePageAmazon(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageAmazon putProductTitle (){
        driver.findElement(checkBoxSelector).sendKeys("Nintendo");
        return this;
    }

    public ArticlePage validateSearchBox(){

        driver.findElement(validateSearchSelector).click();
        return new ArticlePage(driver);
    }
}









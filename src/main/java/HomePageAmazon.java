import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class HomePageAmazon {

    WebDriver driver;

    public HomePageAmazon(WebDriver driver) {
        this.driver = driver;
    }

    public void putTextOncjeckBox (){
        By checkBoxSelector = By.id("twotabsearchtextbox");
        driver.findElement(checkBoxSelector).sendKeys("Nintendo");
    }

    public void validateSearchBox(){
        By validateSearchSelector = By.id("nav-search-submit-button");
        driver.findElement(validateSearchSelector).click();

    }
}









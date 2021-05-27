import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ArticlePage {

    WebDriver driver;
    By titleFirstArticlSelector = By.cssSelector("#productTitle");
    By firstArticleSelector = By.cssSelector(".s-image");

    public ArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    public String chooseFirstArticle(){

        // recuperer le 1er element de la liste des produits trouvés
        List<WebElement> listOfImage = driver.findElements(firstArticleSelector);
        listOfImage.get(0).click();

        // vérifier si le titre contient bien le nom -> Nintendo:
        String resultatTrouve = driver.findElement(titleFirstArticlSelector).getText();
        return resultatTrouve;
    }
}

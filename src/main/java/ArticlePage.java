import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ArticlePage {

    WebDriver driver;

    public ArticlePage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFirstArticle(){
        String resultatAttendu = "Nintendo";

        // recuperer le 1er element de la liste des produits trouvés
        By firstArticleSelector = By.cssSelector(".s-image");
        List<WebElement> listOfImage = driver.findElements(firstArticleSelector);
        listOfImage.get(0).click();

        // vérifier si le titre contient bien le nom -> Nintendo:
        By titleFirstArticlSelector = By.cssSelector("#productTitle");
        String resultatTrouve = driver.findElement(titleFirstArticlSelector).getText();
        Assert.assertTrue(resultatTrouve.contains(resultatAttendu),"le titre ne match pas");
    }
}

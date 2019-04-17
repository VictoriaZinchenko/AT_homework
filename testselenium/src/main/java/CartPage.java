import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(xpath = "//tbody/tr/td[2]")
    private WebElement product;
    public void checkProduct() {
        if (product.isDisplayed()) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

    }

}

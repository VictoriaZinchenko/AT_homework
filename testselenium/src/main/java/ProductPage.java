import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    @FindBy(xpath = "//p[@id='add_to_cart']/button")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@id='layer_cart']/div/div[2]/div[4]/a/span")
    private WebElement buttonCheckoutCart;

    public ProductPage getButtonAddToCart() {
        try {
            TimeUnit.SECONDS.sleep(5);
            buttonAddToCart.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
    public ProductPage getButtonCheckoutCart() {
        try {
            TimeUnit.SECONDS.sleep(5);
            buttonCheckoutCart.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}

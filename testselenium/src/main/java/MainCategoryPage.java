import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainCategoryPage {
    @FindBy(xpath = "(//a[contains(text(),'Summer Dresses')])[5]")
    private WebElement summerDresses;
    public MainCategoryPage getMenuSummerDresses() {
        try {
            TimeUnit.SECONDS.sleep(5);
            summerDresses.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

}

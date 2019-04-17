import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class MyAccountPage {
    @FindBy(xpath = "(//a[contains(text(),'Dresses')])[5]")
    private WebElement menuDresses;
    public MyAccountPage getMenuDresses() {
        try {
            TimeUnit.SECONDS.sleep(5);
            menuDresses.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}

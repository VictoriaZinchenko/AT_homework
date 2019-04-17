import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CategoryPage {
        @FindBy(xpath = "//li[2]/div/div[2]/h5/a")
        private WebElement printedDress;
        public CategoryPage getMenuSummerDresses() {
            try {
                TimeUnit.SECONDS.sleep(5);
                printedDress.click();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this;
        }
}

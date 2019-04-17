import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class MainPage {
        @FindBy(xpath = "//a[contains(text(),'Sign in')]")
        private WebElement signIn;

        public MainPage getSignIn() {
                try {
                        TimeUnit.SECONDS.sleep(5);
                        signIn.click();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                return this;
        }
}




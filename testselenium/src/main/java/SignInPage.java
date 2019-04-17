import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SignInPage {
    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    private WebElement signIn;

    @FindBy(xpath = "//div[2]/form/div/div/input")
    private WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;

        public SignInPage getSignIn(String em, String pass)  {
            try {
                TimeUnit.SECONDS.sleep(5);
                email.sendKeys(em);
                password.sendKeys(pass);
                signIn.click();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this;
   }


}

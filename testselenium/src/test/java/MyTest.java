import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyTest {
    private MainPage page;
    private SignInPage page1;
    private MyAccountPage page2;
    private MainCategoryPage page3;
    private CategoryPage page4;
    private ProductPage page5;
    private CartPage page6;

    @Before

    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vika Zinchenko\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        page = PageFactory.initElements(driver, MainPage.class);
        page1 = PageFactory.initElements(driver, SignInPage.class);
        page2 = PageFactory.initElements(driver, MyAccountPage.class);
        page3 = PageFactory.initElements(driver, MainCategoryPage.class);
        page4 = PageFactory.initElements(driver, CategoryPage.class);
        page5 = PageFactory.initElements(driver, ProductPage.class);
        page6 = PageFactory.initElements(driver, CartPage.class);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void run(){
        page.getSignIn();
        page1.getSignIn("qa@gmail.com","12345");
        page2.getMenuDresses();
        page3.getMenuSummerDresses();
        page4.getMenuSummerDresses();
        page5.getButtonAddToCart();
        page5.getButtonCheckoutCart();
        page6.checkProduct();

    }


}

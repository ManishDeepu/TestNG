import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Manish on 6/19/2017.
 */
public class Facebook {
    WebDriver driver;
    String baseUrl= "https://www.facebook.com/";

    @BeforeTest
    public void openBrowser(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\maade\\Desktop\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.get(baseUrl);
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void loginPage(){
    //WebElement firstname=
            driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("Deepu");
    //firstname.click();
    //firstname.sendKeys("Deepu");
    //WebElement lastname =
        driver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys("Adepu");
    //lastname.click();
    //lastname.sendKeys("Adepu");
   // WebElement email =
            driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("adepudeepu@gmail.com");
            driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("adepudeepu@gmail.com");
   // email.click();
  //  email.sendKeys("adepudeepu@gmail.com");
     driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("Adepu143");
        Select monthselection = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
        monthselection.selectByValue("10");
        Select dayselection = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
        dayselection.selectByValue("1");
        Select yearselection = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
        yearselection.selectByValue("1993");
    driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
    driver.findElement(By.xpath(".//*[@id='u_0_m']")).click();
    }
}

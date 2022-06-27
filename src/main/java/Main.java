import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {
    WebDriver driver;
    @BeforeMethod
    public void start()  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lusine1920\\Desktop\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");

    }
    @Test

    public void searchByClass ()  {
        // search by classname and click
        driver.findElement(By.className("item-link")).click();

    }

    @Test

    public void searchByXpath ()  {
        // search by xPath and click
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Test

    public void searchById () {
        // search by Id and click
        try {
            driver.findElement(By.id("search_query_top")).click();
        } catch (Exception e) {
            System.out.println("Element not found");
        }
    }
    @Test
        public void searchByLinkText () {
            // search by linkText and click
            driver.findElement(By.linkText("Women")).click();
        }

        @Test
    public void searchByTagName () {
        driver.findElement(By.tagName("img")).click();
        }

        @Test
    public void searchByPartialText () {
        driver.findElement(By.partialLinkText("T-shirts")).click();
        }

    @Test
    public void navigate () {
        driver.navigate().back();
    }

    @AfterMethod
    public void turnOff () {
        driver.quit();
    }


    }


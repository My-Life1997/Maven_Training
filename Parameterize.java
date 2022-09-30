import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize
{
     @Parameters({"FirstName","Email"})
    @Test
    public void sample(String FirstName,String Email) throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);

        driver.findElement(By.id("userName")).sendKeys(FirstName);
        driver.findElement(By.id("userEmail")).sendKeys(Email);

    }
}


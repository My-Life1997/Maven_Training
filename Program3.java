package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program3 {
    @Parameters({"Email","Pass"})
    @Test
    public void sample(String Email,String Pass) throws Throwable
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);

        driver.findElement(By.name ("username")).sendKeys(Email);
        driver.findElement(By.name ("password")).sendKeys(Pass);

    }
}

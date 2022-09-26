package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("HELLO");
        driver.findElement(By.cssSelector("input[id='continue']")).click();
        Thread.sleep(3000);
        driver.close();
    }
}

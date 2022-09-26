package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple iPhone 11, 64GB, Purple - Fully Unlocked (Renewed)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[text()='Apple iPhone 11, 64GB, Purple - Fully Unlocked (Renewed)'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        driver.quit();
    }
}


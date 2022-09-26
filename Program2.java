package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

    }
}

package Java;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class Screenshot {
    public static void main(String[]args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\i732486\\Screenshot\\Amazon.png");
       FileHandler.copy(src,dest);
        driver.quit();
    }
}

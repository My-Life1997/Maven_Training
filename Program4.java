package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732486\\Selenium jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Home']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        driver.close();

    }


}
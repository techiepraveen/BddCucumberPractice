package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
    public static WebDriver driver;


    public void browsersetup(){
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

    }

    public void quitbrowser(){
        driver.quit();
    }
}

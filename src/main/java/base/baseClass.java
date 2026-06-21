package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.ConfigReader;

public class baseClass {
    public static WebDriver driver;
    ConfigReader config = new ConfigReader();

    public void browsersetup(){

        String browser = config.getBrowser();

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
         //below line is used for running chrome in headless mode, comment out in case you want to run in headed mode
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver= new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Safari")) {
            driver= new SafariDriver();

        } else{
            System.out.println("no browser found");
        }

        driver.manage().window().maximize();
        driver.get(config.getUrl());

    }

    public void quitbrowser(){
        driver.quit();
    }
}

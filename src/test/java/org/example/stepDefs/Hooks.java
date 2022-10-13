package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser()
    {
        //1- Bridge
        System.setProperty("webdriver.chrome.driver","E:\\demonopcommerceA\\src\\main\\resources\\chromedriver.exe");

        //2- Create new object from ChromeDriver
        driver = new ChromeDriver();

        //3- Configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- Navigate to the website

        driver.navigate().to("https://demo.nopcommerce.com/");

    }



    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }


}

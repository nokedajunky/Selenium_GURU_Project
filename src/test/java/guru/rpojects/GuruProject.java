package guru.rpojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruProject {

    WebDriver driver = new FirefoxDriver();

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","directory here");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test(){
        // go to the site
        driver.get("http://demo.guru99.com/V4/");

        //find userID field
        WebElement textUserID = driver.findElement(By.name("uid"));
        textUserID.sendKeys("mngr151026");

        //find password field
        WebElement textPassword = driver.findElement(By.name("password"));
        textPassword.sendKeys("yzUsyje");

        //click ligin btn
        WebElement buttonLogin = driver.findElement(By.name("btnLogin"));
        buttonLogin.click();

    }

}

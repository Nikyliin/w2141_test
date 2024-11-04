package org.example;

import org.example.pom.FormaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormeTest {

    public static String FIRST_NAME = "eu";
    public static WebDriver driver;

    @BeforeClass
    public void BeforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void FormaTest(){ //metoda de testare
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage page = new FormaPage(driver);
        page.setFirstName(FIRST_NAME);
        //WebElement firstNameEl = driver.findElement(By.xpath("//*[@id='firstName']"));
        //firstNameEl.sendKeys("'Anatolie'");
    }

    @AfterClass
    public void Close(){
        driver.quit();
    }
}

package org.example.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage {
    @FindBy(xpath = "//*[@id='firstName']") private WebElement firstNameEl;
    public static WebDriver driver;
    public FormaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setFirstName(String firstNameParam){
        firstNameEl.sendKeys(firstNameParam);
    }
}

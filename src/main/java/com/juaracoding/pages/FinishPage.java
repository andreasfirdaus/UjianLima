package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FinishPage {

    private WebDriver driver;

    public FinishPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='finish']")

    WebElement btnFinish;
    @FindBy(xpath = "//span[@class='title']")

    WebElement txtFinish;

    public void finish(){
        btnFinish.click();
    }
    public String getTxtFinish (){
        return txtFinish.getText();
    }

}
